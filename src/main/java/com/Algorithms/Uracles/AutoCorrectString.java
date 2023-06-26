package com.Algorithms.Uracles;

public class AutoCorrectString {

   /**
    You've been tasked with writing an autocorrect service for messages sent by
    your legal team. The messages which are sent to other lawyers need to be updated so
    that each message sent references the lawyer's client for clarity. To do this you need
    to replace all instances of "you" and its misspellings with "your client".

    Complete the function so that it takes a string and replaces all
    instances of "you", "youuu", or "u" (not case_sensitive) with "your client" (always lower case).

    Return the resulting string.
    **/


       public static String autocorrect(String message) {
           // Convert the message to lower case for case-insensitive matching
           String lowerCaseMessage = message.toLowerCase();

           // Replace "you" and its misspellings with "your client"
           String correctedMessage = lowerCaseMessage.replaceAll("(?i)\\b(youuu?|u)\\b", "your client");

           // Return the corrected message
           return correctedMessage;


       }

    public static void main(String[] args) {
        System.out.println(AutoCorrectString.autocorrect("Hey, can u send me the documents? I need you to review them."));
    }
   }



