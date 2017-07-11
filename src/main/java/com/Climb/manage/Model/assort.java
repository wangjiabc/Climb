package com.Climb.manage.Model;

import java.io.Serializable;
import java.util.Date;

import org.bson.Document;

public class assort implements Serializable{
private Document document;
	
    private String title;
	
    private String type;
    
    private String source;
    
	private String content;
	
	private String date;
	
	private Date insertDate;
	
	private String path;

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}



		public String getContent() {
			return content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public String getPath() {
			return path;
		}

		public void setPath(String path) {
			this.path = path;
		}

		public Document getDocument() {
			return document;
		}

		public void setDocument(Document document) {
			this.document = document;
		}

		public String getSource() {
			return source;
		}

		public void setSource(String source) {
			this.source = source;
		}

		public String getDate() {
			return date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public String getInsertDate() {
			return new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm").format(insertDate);
		}

		public void setInsertDate(Date insertDate) {
			this.insertDate = insertDate;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}
}
