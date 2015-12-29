package user;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.maplesyrup.sellingbook.domain.user.User;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/resources/config/context-common.xml",
		"file:src/main/resources/config/context-mybatis.xml",
		"file:src/main/resources/config/context-transaction.xml"})

//@ContextConfiguration({ "classpath*:context-common.xml",
//						"classpath*:context-mybatis.xml",
//						"classpath*:context-transaction.xml" })
public class UserTest {

	User user1;
	User user2;
	User user3;
	
	@Autowired
	private SqlSession sqlSession;
	
	//execute only once, in the starting 
	@BeforeClass
	public static void beforeClass() { 
		System.out.println("in before class"); 
	}
	
	//execute only once, in the end 
	@AfterClass 
	public static void afterClass() { 
		System.out.println("in after class"); 
	}
	
	@Before
	public void setUp(){
		System.out.println("before");
		user1 = new User(0,"aaa@aa", "1234", "nick1");
		user2 = new User(0,"bbb@bb", "4567", "nick2");
		user3 = new User(0,"ccc@cc", "8901", "nick3");
	}
	
	@After
	public void after(){
		System.out.println("after");
//		sqlSession.delete("user.delete");
	}
	
	@Test
	public void test() {
		System.out.println("test");
		sqlSession.insert("user.insert", user1);
		sqlSession.insert("user.insert", user2);
		sqlSession.insert("user.insert", user3);
	}

}
