package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ObjectSampleModel;

@WebServlet("/ObjectSampleServlet") //②URLパターンを「ObjectSample」として設定

public class ObjectSampleServlet extends HttpServlet{

	private ObjectSampleModel model = new ObjectSampleModel();

	/* (非 Javadoc)
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 * サーブレットクラスがGETで呼ばれた場合のdoGetメソッドをオーバーライドする。書き方は基本このお決まりの書き方になる。
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException{
		request.getRequestDispatcher("/WEB-INF/ObjectSample.jsp").forward(request, response);
	}

	/* (非 Javadoc)
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 * サーブレットクラスがPOSTで呼ばれた場合のdoGetメソッドをオーバーライドする。書き方は基本このお決まりの書き方になる。
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
		throws IOException, ServletException{
		//文字コードセット
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");

		//送信ボタン押下時のPOST
		if(request.getParameter("sendBtn") != null){
			String name = request.getParameter("name");
			String birthDay = request.getParameter("birthDay");
			String old = request.getParameter("old");

			model.setProfileObject(name, birthDay, old);
		}
		//検索ボタン押下時のPOST
		else if(request.getParameter("searchBtn") != null){
			String selectProperty = request.getParameter("selectProperty");
			String searchWord = request.getParameter("searchWord");

			request.setAttribute("searchResultList", model.searchProfileObject(selectProperty, searchWord));
		}
		request.setAttribute("requetPoList", model.getProfileObjectList());
		request.getRequestDispatcher("/WEB-INF/ObjectSample.jsp").forward(request, response);
	}
}
