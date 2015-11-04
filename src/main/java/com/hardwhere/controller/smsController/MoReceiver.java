package com.hardwhere.controller.smsController;

/**
 * Created by tharinda on 11/4/15.
 */

import com.hardwhere.controller.functions.Query;
import com.hardwhere.model.Item;
import hms.kite.samples.api.SdpException;
import hms.kite.samples.api.sms.MoSmsListener;
import hms.kite.samples.api.sms.SmsRequestSender;
import hms.kite.samples.api.sms.messages.MoSmsReq;
import hms.kite.samples.api.sms.messages.MtSmsReq;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MoReceiver implements MoSmsListener
{
    private static final Logger LOGGER = Logger.getLogger(MoReceiver.class.getName());
    private SmsRequestSender requestSender;

    @Override
    public void init()
    {

    }

    @Override
    public void onReceivedSms(final MoSmsReq moSmsReq)
    {

        String message = moSmsReq.getMessage();
        LOGGER.log(Level.ALL, "New message received " + moSmsReq.getMessage());
        String[] messages = message.split(" ");
        System.out.println(messages[0]);

        MtSmsReq mtSmsReq = new MtSmsReq();
        if (messages[1].equals("query")){
            try {
                mtSmsReq.setMessage(sendQuery(messages[2]));
            } catch (UnknownHostException e) {
                e.printStackTrace();
            }
        }else {

            mtSmsReq.setMessage("We'll reply you soon!");

        }

        mtSmsReq.setApplicationId(moSmsReq.getApplicationId());
        mtSmsReq.setPassword("password");
//        mtSmsReq.setPassword("027963e9b53d3e9297b99f7a66fb6d2f");
        mtSmsReq.setDestinationAddresses(Arrays.asList(moSmsReq.getSourceAddress()));

        try
        {
            //connect to database
            requestSender = new SmsRequestSender(new URL("http://localhost:7000/sms/send"));
//            requestSender = new SmsRequestSender(new URL("https://api.dialog.lk/sms/send"));
            requestSender.sendSmsRequest(mtSmsReq);
            MessagesDB users=new MessagesDB();
            users.UpdateUserCollection(messages[0],moSmsReq.getSourceAddress(),moSmsReq.getApplicationId(),messages[2],messages[1]);

        }
        catch (SdpException e)
        {
            LOGGER.log(Level.ALL, "MT message sending error " + e);
        }
        catch (MalformedURLException e)
        {
            LOGGER.log(Level.ALL, "URL error " + e);
        }
        catch (UnknownHostException e) {
            e.printStackTrace();
        }


    }

    public String sendQuery(String itemName) throws UnknownHostException {

        ArrayList<Item> items;
        String out="";
        items=new Query().getItemsByrPrice(itemName);

        if (items.size() == 0){
            out = "That item is not this shop";
        }
        else {

            for (int i = 0; i < items.size(); i++) {

                out = out + "description:" + items.get(i).getItem_Description() + " " +
                        "price:" + items.get(i).getItem_Price() + "\n";
            }
        }
        return out;
    }

}
