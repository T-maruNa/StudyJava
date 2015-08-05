package model.object;



public class ProfileObject{

	//▽▼▽▼▽▼▽▼プロパティ設定▽▼▽▼▽▼▽▼▽▼

	/**
	 * 名前
	 */
	private String name;

	/**
	 * 誕生日
	 */
	private String birthDay;

	/**
	 * 年齢
	 */
	private String old;


	//▽▼▽▼▽▼▽▼プロパティのゲッター/セッター▽▼▽▼▽▼▽▼▽▼

	/**
	 * @param name
	 * 「ProfileObject.名前」に名前を設定
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * @return
	 * 「ProfileObject.名前」を取得する
	 */
	public String getName()
	{
		return this.name;
	}

	/**
	 * @param birthDay
	 * 「ProfileObject.誕生日」に誕生日を設定
	 */
	public void setBirthDay(String birthDay)
	{
		this.birthDay = birthDay;
	}

	/**
	 * @return
	 * 「ProfileObject.誕生日」を取得する
	 */
	public String getBirthDay()
	{
		return this.birthDay;
	}

	/**
	 * @param old
	 * 「ProfileObject.年齢」に年齢を設定
	 */
	public void setOld(String old)
	{
		this.old = old;
	}

	/**
	 * @return
	 * 「ProfileObject.年齢」を取得する。
	 */
	public String getOld()
	{
		return this.old;
	}
}
