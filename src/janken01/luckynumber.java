package janken01;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class luckynumber
 */
public class luckynumber extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public luckynumber() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		String lucky_message = null;
		String l_message = null;
		String lu_message = null;
		String gazo = null;

		long a = (int)Math.floor(Math.random() * 10) + 1;

		if( a <= 3 || a == 7 ){
			lucky_message = "大吉";
			l_message = "今日のラッキーナンバーは" + a + "です。";
			lu_message = "今日は勢いに任せてどんどん行きましょう(^o^)";

		}else if( a == 5 || a == 6 || a == 8 ){
			lucky_message = "中吉";
			l_message = "今日のラッキーナンバーは" + a + "です。";
			lu_message = "今日は普通の一日です(-_-)";

		}else if( a >= 9 || a == 4 ){
			lucky_message = "小吉";
			l_message = "今日のラッキーナンバーは" + a + "です。";
			lu_message = "今日は焦らずにゆっくり過ごしましょう(>_<)";
	    }
		request.setAttribute("lucky_message", lucky_message);
		request.setAttribute("l_message", l_message);
		request.setAttribute("lu_message", lu_message);

		String url ="/luckynumber.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	    }
}
