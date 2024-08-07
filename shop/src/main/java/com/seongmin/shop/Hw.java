package com.seongmin.shop;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Data
@SequenceGenerator(name = "hw_seq", sequenceName = "hw_seq", initialValue = 1, allocationSize = 1)
// DROP SEQUENCE hw_seq으로 시퀀스 정보 초기화 (SQLDEVELOPER)
public class Hw {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hw_seq")
    private Long id;

    private String title;

    @DateTimeFormat(iso= DateTimeFormat.ISO.DATE)
    private Date writtenDate;

    // 컬럼명을 초기에 upload_date로 설정한 후 uploadDate로 변경
    // 변경 이후 서버 실행 시마다 upload_date 컬럼이 자동 생성 중 (spring.jpa.hibernate.ddl-auto=update)
    // update외에 none이나 validate로 설정하면 컬럼생성은 되지 않지만, 다른 오류 발생
    // 원인분석: uploadDate라고 변수명을 선언하면 자동적으로 upload_date컬럼을 생성 (update옵션)
    //         대문자가 중간에 존재하면 그것을 자동으로 underscore 분할해줌
    // 결론: java에서는 일반적으로 Camel Case를 사용하므로 uploadDate와 같이 명명하는 것이 옳음
    //      sql에서는 일반적으로 Snake Case를 사용하므로 upload_date와 같이 명명하는 것이 옳음
    //      그러므로 크게 신경쓸 필요가 없다!
    //      @ToString을 사용할 때도 그냥 getUploadDate()로 깔끔하게 만들어준다!


    // @DateTimeFormat(iso= DateTimeFormat.ISO.DATE)
    // private Date writtenDate;
    // DateTimeFormat 어노테이션이 없었을 때는 Controller에서 @ModelAttribute Hw hw로 객체 생성을 못했는데
    // 어노테이션 추가하고 에러 해결됨
}
