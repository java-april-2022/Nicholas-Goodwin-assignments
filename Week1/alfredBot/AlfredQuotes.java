package Week1.alfredBot;

import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        return String.format("good evening,"+ name);
    }
    
    public String dateAnnouncement() {
        return String.format("todays date is," + new Date());
    }

    public String jeopardyAnnouncement() {
        return String.format("Hello, lets play Jeopardy!");
    } //Added method inspired by my google home assistant
    
    public String respondBeforeAlexis(String conversation) {
        if(conversation.indexOf("Alexis") > -1) {
            return "She's on her break right now, lets see if I can help!";
        }
        if(conversation.indexOf("Alfred") > -1) {
            return "Alfredbot at your service!";
        }
        return "See you later!!";
    }

    public String testGuestOverload(int i) {
        return null;
    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

