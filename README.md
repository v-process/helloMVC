# MVC패턴을 이용한 회원가입 및 로그인 기능 구현

### controller

	1. DoLogin
		- userId / userPw를 getParameter로 받아 서비스 객체안의 로그인 method를 리턴되는 값을 활용하여 로그인 및 로그인 실패 판단. 
		
    2. DoRegister
    	- id,pw,name,gender,email값을 받아 customer 객체를 생성한 후 서비스 객체의 addcustomer로 customer객체 보냄.
    	
    3. Home
    	- 사용자 action값에 따라 loginform.jsp와 registerform.jsp 선택가능


### model 
	1. Customer
		- 멤버변수 id,pw,name,gender,email값을 가지고 있는 객체(자바빈) 기본생성자와 getter,setter를 가지고 있으며 lombok 라이브러리를 
		  사용하여 @표시로 getter,setter,생성자에 대한 코드를 줄임.


### service
	1. CustomerService
		- 실질적인 비즈니스 로직이 구현되어있으며 DoRegister/DoLogin에서 동시에 객체를 활용하기 위해 디자인패턴 중 하나인 싱글톤 패턴을 사용함. 
          기능적으로 수행되는 addCustomer는 유저를 추가하는 역할을 하며 loginCustomer는 id와 pw를 받아 동일한 객체의 값이면 customer 객체를 
          리턴하며 아니라면 null값을 리턴한다.
        
        
### view
	1. error
		- home에서 로그인과 회원가입에 대한 action이 아닐때 표시됨.
		
	2. loginFail 
		- 로그인 실패에 대한 페이지이며 로그인 실패시 JSP Expression Language를 사용하여 로그인을 시도한 id값에 대한 실패를 알려줌.
		
    3. loginform 
    	- 로그인에 대한 form 에 대한 페이지 이며 action을 보내면 post 방식으로 doLogin에 보내진다. html tag의 body위에 style을 적용하였음.
    	
    4. loginSuccess
    	- 로그인 성공할 경우의 페이지이며 JSP Expression Language를 사용하여 사용자의 id, name, email을 표시한다.
    
    5. registerForm
    	- login에서 사용되는 style을 동일하게 적용하여 레이아웃을 구성하였고 회원가입에 필요한 id,pw,gender,email,name을 입력 받아 doRegister로 넘긴다.

	6. registerSuccess
		- 회원가입이 성공할 경우 나오는 페이지이며 a태그를 통해 홈으로 이동이 가능하다.
