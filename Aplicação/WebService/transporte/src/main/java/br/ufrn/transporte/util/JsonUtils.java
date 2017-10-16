package br.ufrn.transporte.util;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

public class JsonUtils {

	static public String obterDadoJson(String json, String dado) {
		String retorno = new String();
		try {
			JSONObject jsonObject = new JSONObject(json);
			retorno = jsonObject.getString(dado);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return retorno;

	}

}
