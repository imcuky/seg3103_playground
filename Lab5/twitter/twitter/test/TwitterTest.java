import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;

import static org.easymock.EasyMock.*;

class TwitterTest {

    @Test
    void actual_call() {

        Twitter twitter = new Twitter();

        boolean actual;

        actual = twitter.isMentionned("me");
        assertEquals(true, actual);
    }

    @Test
    void mock_full_object() {

        Twitter twitter = createMock("twitter", Twitter.class);

        expect(twitter.loadTweet()).andReturn("hello @me");
        expect(twitter.loadTweet()).andReturn("hello @you");
        replay(twitter);

        String actual;

        actual = twitter.loadTweet();
        assertEquals("hello @me", actual);

        actual = twitter.loadTweet();
        assertEquals("hello @you", actual);
    }

    @Test
    void mock_partial_object() {

        Twitter twitter = partialMockBuilder(Twitter.class)
        .addMockedMethod("loadTweet")
        .createMock();

      expect(twitter.loadTweet()).andReturn("hello @me").times(2);
      replay(twitter);

      boolean actual;

      actual = twitter.isMentionned("me");
      assertEquals(true, actual);

      actual = twitter.isMentionned("you");
      assertEquals(false, actual);
    }


    //-------------------------------------------------

    @Test
    void isMentionned_lookForAtSymbol() {
      // Assuming a tweet like "hello @me"
      // isMentionned("me") should be true
      // isMentionned("you") should be false

        Twitter twitter = partialMockBuilder(Twitter.class).addMockedMethod("loadTweet").createMock();
        expect(twitter.loadTweet()).andReturn("hello @me").times(2);
        replay(twitter);
        
        boolean actual;
        actual = twitter.isMentionned("me");
        assertEquals(true, actual);
        actual = twitter.isMentionned("you");
        assertEquals(false, actual);
    }

    @Test
    void isMentionned_dontReturnSubstringMatches() {
      // Assuming a tweet like "hello @meat"
      // isMentionned("me") should be false
      // isMentionned("meat") should be true
      Twitter twitter = partialMockBuilder(Twitter.class).addMockedMethod("loadTweet").createMock();
      expect(twitter.loadTweet()).andReturn("hello @meat").times(2);
      replay(twitter);
  
      assertFalse(twitter.isMentionned("me"));
      assertTrue(twitter.isMentionned("meat"));
    }

    @Test
    void isMentionned_superStringNotFound() {
      // Assuming a tweet like "hello @me"
      // isMentionned("me") should be true
      // isMentionned("meat") should be false

        Twitter twitter = partialMockBuilder(Twitter.class).addMockedMethod("loadTweet").createMock();
        expect(twitter.loadTweet()).andReturn("hello @me").times(2);
        replay(twitter);

        assertTrue(twitter.isMentionned("me"));
        assertFalse(twitter.isMentionned("meat"));
    }

    @Test
    void isMentionned_handleNull() {
      // Assuming no tweet is available (i.e. null)
      // isMentionned("me") should be false
      // isMentionned("meat") should be false
        Twitter twitter = partialMockBuilder(Twitter.class).addMockedMethod("loadTweet").createMock();
        expect(twitter.loadTweet()).andReturn(null).times(2);
        replay(twitter);

        assertFalse(twitter.isMentionned("me"));
        assertFalse(twitter.isMentionned("meat"));
    }
}