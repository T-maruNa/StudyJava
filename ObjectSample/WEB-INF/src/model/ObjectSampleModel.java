package model;

import java.util.ArrayList;
import java.util.stream.Collectors;

import model.object.ProfileObject;

import org.apache.commons.lang3.StringUtils;

public class ObjectSampleModel {

	private ArrayList<ProfileObject> poList = new ArrayList<ProfileObject>();

	private final String PROPERTY_NAME = "名前";
	private final String PROPERTY_BIRTHDAY = "誕生日";
	private final String PROPERTY_OLD = "年齢";
	/**
	 * ProfileObjectを追加
	 * @param name 名前
	 * @param birthDay 誕生日
	 * @param old 年齢
	 */
	public void setProfileObject(String name,String birthDay,String old){

		if(StringUtils.isEmpty(name)
			&& StringUtils.isEmpty(birthDay)
			&& StringUtils.isEmpty(old)){
			return;
		}

		//画面からのデータを格納するためのオブジェクトを宣言
		ProfileObject po = new ProfileObject();

		//画面から渡されたデータ(POST)をオブジェクトに格納
		po.setName(name);        //ProfileObject.名前 = name;
		po.setBirthDay(birthDay);//ProfileObject.誕生日 = birthDay;
		po.setOld(old);          //ProfileObject.年齢 = old;

		//プロフィールリストに追加
		//▽▼▽▼▽▼▽▼▽▼▽▼INSERTに変える▽▼▽▼▽▼▽▼▽▼▽▼
		this.poList.add(po);
	}

	public ArrayList<ProfileObject> getProfileObjectList(){
		return this.poList;
	}

	/**
	 * ProfileObjectListから検索
	 * @param propertyId
	 * @param searchWord
	 */
	public ArrayList<ProfileObject> searchProfileObject(String selectProperty, String searchWord){

		//▽▼▽▼▽▼▽▼▽▼▽▼SELECTにする▽▼▽▼▽▼▽▼▽▼▽▼▽▼
		if(this.poList.size() <= 0){
			return null;
		}


		switch (selectProperty) {
			case PROPERTY_NAME:
				return this.poList.stream().filter(x -> x.getName().equals(searchWord)).collect(Collectors.toCollection(ArrayList:: new ));

			case PROPERTY_BIRTHDAY:
				return this.poList.stream().filter(x -> x.getBirthDay().equals(searchWord)).collect(Collectors.toCollection(ArrayList:: new ));

			case PROPERTY_OLD:
				return this.poList.stream().filter(x -> x.getOld().equals(searchWord)).collect(Collectors.toCollection(ArrayList:: new ));

			default:
				return null;
		}
	}
}
