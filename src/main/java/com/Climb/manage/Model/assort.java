package com.Climb.manage.Model;

import java.io.Serializable;
import java.util.Date;

public class assort implements Serializable{
	 private String title;
		
		private String content;
		
		private Date date;
		
		private String path;

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date = date;
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
}
