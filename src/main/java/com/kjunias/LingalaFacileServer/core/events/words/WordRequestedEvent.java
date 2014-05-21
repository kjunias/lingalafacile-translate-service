package com.kjunias.LingalaFacileServer.core.events.words;

import java.util.UUID;

public class WordRequestedEvent {
	private UUID key;
	private boolean entityFound;
	
	public WordRequestedEvent(UUID key) {
		this.key = key;
	}

	public static WordRequestedEvent wordNotFound(UUID key) {
		WordRequestedEvent ev = new WordRequestedEvent(key);
		ev.entityFound = false;
		return ev;
	}

	public UUID getKey() {
		return key;
	}

	public void setKey(UUID key) {
		this.key = key;
	}

	public boolean isEntityFound() {
		return entityFound;
	}

	public void setEntityFound(boolean entityFound) {
		this.entityFound = entityFound;
	}
}
