package com.kjunias.LingalaFacileServer.core.events.words;

import java.util.UUID;

import com.kjunias.LingalaFacileServer.core.events.orders.OrderDetailsEvent;

public class WordDefinitionsEvent {
	private UUID key;
	private boolean entityFound;
	  
	public WordDefinitionsEvent(UUID key) {
		this.key = key;
	}

	public static WordDefinitionsEvent notFound(UUID key) {
		WordDefinitionsEvent ev = new WordDefinitionsEvent(key);
		ev.entityFound = false;
		return ev;
	}
}