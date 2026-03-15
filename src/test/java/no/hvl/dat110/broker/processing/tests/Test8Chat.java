package no.hvl.dat110.broker.processing.tests;

import no.hvl.dat110.client.Client;
import no.hvl.dat110.common.Logger;
import no.hvl.dat110.messages.PublishMsg;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;


public class Test8Chat extends Test0Base {

	@Test
	public void test() {

		broker.setMaxAccept(10);

        Logger.log("Starting up broker ...");

		// allow broker to process subscriptions
		try {
            Logger.log("Press any key to shut down broker ...");
            System.in.read();
		} catch (Exception e) {
			e.printStackTrace();
		}

        Logger.log("Shutting down broker ...");
	}
}
