package capstone.socialchild.dto.member.response;

import capstone.socialchild.domain.member.Gender;
import capstone.socialchild.domain.member.Member;
import capstone.socialchild.domain.member.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DetailMember {

    private Long id;                // 회원번호(PK)
    private String loginId;         // 로그인ID
    private String name;            // 이름
    private LocalDate birth;        // 생년월일
    private Gender gender;          // 성별[MALE, FEMALE]
    private String phone_no;        // 전화번호
    private Role role;              // 역할[CHILD, TEACHER]
    private String imagePath;       // 이미지
    private Long stampCnt;          // 도장 개수
    private Double latitude;
    private Double longitude;


    public static DetailMember of(Member member) { // 정적 팩토리 메서드
        DetailMember detailMember = new DetailMember();

        detailMember.id = member.getId();
        detailMember.loginId = member.getLoginId();
        detailMember.name = member.getName();
        detailMember.birth = member.getBirth();
        detailMember.gender = member.getGender();
        detailMember.phone_no = member.getPhone_no();
        detailMember.role = member.getRole();
        detailMember.imagePath = member.getImagePath();
        detailMember.stampCnt = member.getStampCnt();
        detailMember.latitude = member.getLatitude();
        detailMember.longitude = member.getLongitude();

        return detailMember;
    }
}