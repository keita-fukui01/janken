package janken01;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class decision
 */
public class decision extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public decision() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		int choose = Integer.parseInt(request.getParameter("choose"));//自分が選んだ手
		int cpu = (int)Math.floor(Math.random() * 3 + 1);//cpuがランダムで選んだ手

		String message = null;//勝敗メッセージ

		String choosech = null;//自分の手
		String cpuc = null;//cpuの手

		String user = null;//自分の手の画像
		String cpucpu = null;//cpuの手の画像

		String gazo = null;


		if((choose == 1 && cpu == 1) || (choose == 2 && cpu == 2) || (choose == 3 && cpu == 3)) {
			message = "あいこです";
			gazo = "images/cat_12.jpg";

		}else if((choose == 1 && cpu == 2) || (choose == 2 && cpu == 3) || (choose == 3 && cpu == 1)) {
			message = "あなたの勝ちです";
			gazo = "images/cat_13.jpg";

		}else if((choose == 1 && cpu == 3) || (choose == 2 && cpu == 1) || (choose == 3 && cpu == 2)) {
			message = "あなたの負けです";
			gazo = "images/cat_14.jpg";
		}
		request.setAttribute("message", message);
		request.setAttribute("gazo", gazo);

		if(choose == 1 && cpu == 2) {
			choosech = "ユーザー：グー";
			user = "images/goo_win.jpg";

		}else if((choose == 1 && cpu == 3) || (choose == 1 && cpu == 1)) {
			choosech = "ユーザー：グー";
			user = "images/goo.jpg";

		}else if(choose == 2 && cpu == 3) {
			choosech = "ユーザー：チョキ";
			user = "images/choki_win.jpg";

		}else if((choose == 2 && cpu == 1) || (choose == 2 && cpu == 2)) {
			choosech = "ユーザー：チョキ";
			user = "images/choki.jpg";

		}else if(choose == 3 && cpu == 1) {
			choosech = "ユーザー：パー";
			user = "images/par_win.jpg";

		}else if((choose == 3 && cpu == 2) || (choose == 3 && cpu == 3)) {
			choosech = "ユーザー：パー";
			user = "images/par.jpg";

		}else{
			choosech = "不正なアクセス";
		}
		request.setAttribute("choosech", choosech);
		request.setAttribute("user", user);
		request.setAttribute("cpu", cpu);


		if(cpu == 1 && choose == 2) {
			cpuc = "CPC：グー";
			cpucpu = "images/goo_win.jpg";

		}else if((cpu == 1 && choose == 3) || (cpu == 1 && choose == 1)) {
			cpuc = "CPC：グー";
			cpucpu = "images/goo.jpg";

		}else if(cpu == 2 && choose == 3) {
			cpuc = "CPC：チョキ";
			cpucpu = "images/choki_win.jpg";

		}else if((cpu == 2 && choose == 1) || (cpu == 2 && choose == 2)) {
			cpuc = "CPC：チョキ";
			cpucpu = "images/choki.jpg";

		}else if(cpu == 3 && choose == 1) {
			cpuc = "CPC：パー";
			cpucpu = "images/par_win.jpg";

		}else if((cpu == 3 && choose == 2) || (cpu == 3 && choose == 3)) {
			cpuc = "CPC：パー";
			cpucpu = "images/par.jpg";

		}else{
			cpuc = "不正なアクセス";
		}
		request.setAttribute("cpuc", cpuc);
		request.setAttribute("cpucpu", cpucpu);
		request.setAttribute("choosech", choosech);

		String url ="/result.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}



	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		int choose = Integer.parseInt(request.getParameter("choose"));//自分が選んだ手
		int cpu = (int)Math.floor(Math.random() * 3 + 1);//cpuがランダムで選んだ手

		String message = null;//勝敗メッセージ

		String choosech = null;//自分の手
		String cpuc = null;//cpuの手

		String user = null;//自分の手の画像
		String cpucpu = null;//cpuの手の画像


		if((choose == 1 && cpu == 1) || (choose == 2 && cpu == 2) || (choose == 3 && cpu == 3)) {
			message = "あいこです";

		}else if((choose == 1 && cpu == 2) || (choose == 2 && cpu == 3) || (choose == 3 && cpu == 1)) {
			message = "あなたの勝ちです";

		}else if((choose == 1 && cpu == 3) || (choose == 2 && cpu == 1) || (choose == 3 && cpu == 2)) {
			message = "あなたの負けです";
		}
		request.setAttribute("message", message);



		if(choose == 1 && cpu == 2) {
			choosech = "ユーザー：グー";
			user = "images/goo_win.jpg";

		}else if((choose == 1 && cpu == 3) || (choose == 1 && cpu == 1)) {
			choosech = "ユーザー：グー";
			user = "images/goo.jpg";

		}else if(choose == 2 && cpu == 3) {
			choosech = "ユーザー：チョキ";
			user = "images/choki_win.jpg";

		}else if((choose == 2 && cpu == 1) || (choose == 2 && cpu == 2)) {
			choosech = "ユーザー：チョキ";
			user = "images/choki.jpg";

		}else if(choose == 3 && cpu == 1) {
			choosech = "ユーザー：パー";
			user = "images/par_win.jpg";

		}else if((choose == 3 && cpu == 2) || (choose == 3 && cpu == 3)) {
			choosech = "ユーザー：パー";
			user = "images/par.jpg";

		}else{
			choosech = "不正なアクセス";
		}
		request.setAttribute("choosech", choosech);
		request.setAttribute("user", user);
		request.setAttribute("cpu", cpu);



		if(cpu == 1 && choose == 2) {
			cpuc = "CPC：グー";
			cpucpu = "images/goo_win.jpg";

		}else if((cpu == 1 && choose == 3) || (cpu == 1 && choose == 1)) {
			cpuc = "CPC：グー";
			cpucpu = "images/goo.jpg";

		}else if(cpu == 2 && choose == 3) {
			cpuc = "CPC：チョキ";
			cpucpu = "images/choki_win.jpg";

		}else if((cpu == 2 && choose == 1) || (cpu == 2 && choose == 2)) {
			cpuc = "CPC：チョキ";
			cpucpu = "images/choki.jpg";

		}else if(cpu == 3 && choose == 1) {
			cpuc = "CPC：パー";
			cpucpu = "images/par_win.jpg";

		}else if((cpu == 3 && choose == 2) || (cpu == 3 && choose == 3)) {
			cpuc = "CPC：パー";
			cpucpu = "images/par.jpg";

		}else{
			cpuc = "不正なアクセス";
		}
		request.setAttribute("cpuc", cpuc);
		request.setAttribute("cpucpu", cpucpu);
		request.setAttribute("choosech", choosech);


		String url ="/result.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
