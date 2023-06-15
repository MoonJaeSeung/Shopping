package com.shop.shop.entity;

import com.shop.shop.repository.MemberRepository;
import net.bytebuddy.matcher.ElementMatcher;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.TestPropertySource;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import javax.persistence.PersistenceContext;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
@TestPropertySource(locations = "classpath:application-test.properties")
@Rollback(value = false)
class MemberTest {

    @Autowired
    MemberRepository memberRepository;

    @PersistenceContext
    EntityManager em;

    @Test
    @DisplayName("Auditing 테스트")
    @WithMockUser(username = "moon", roles = "USER")
    public void auditingTest(){
        Member newMember = new Member();
        memberRepository.save(newMember);

        em.flush();
        em.clear();

        Member member = memberRepository.findById(newMember.getId())
                .orElseThrow(EntityNotFoundException::new);

        System.out.println("member.getRegTime() = " + member.getRegTime());
        System.out.println("member.getUpdateTime() = " + member.getUpdateTime());
        System.out.println("member.getCreatedBy() = " + member.getCreatedBy());
        System.out.println("member.getModifiedBy() = " + member.getModifiedBy());
    }

    @Test
    @DisplayName("가지고 있는 쿠폰 확인")
    public void test(){
        Optional<Member> member = memberRepository.findById(13L);
        List<Coupon> coupon = member.get().getCoupon();
        System.out.println("coupon = " + coupon);

    }

    @Test
    @DisplayName("쿠폰 초기화")
    public void test2(){
        Member member = memberRepository.findById(13L).get();
        member.removeAllCoupon();
        System.out.println("member = " + member.getCoupon().size());


    }

}