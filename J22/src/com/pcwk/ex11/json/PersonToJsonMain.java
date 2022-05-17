package com.pcwk.ex11.json;

import com.google.gson.Gson;

public class PersonToJsonMain {

	public static void main(String[] args) {

//java class -> json string
		Person person = new Person("철수", 9, "남자");
//{"name":"철수","age":9,"gender":"남자"}
		Gson gson = new Gson();
		String jsonString = gson.toJson(person);
		System.out.println(jsonString);

	}

}
