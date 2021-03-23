package kimyongtae.hr;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("kimyongtae.hr.dao.map")
public class Main {
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
}