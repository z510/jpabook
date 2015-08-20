package jpabook.start;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

 
public class JpaAuthMain {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpabook");
        EntityManager em = emf.createEntityManager();
        EntityTransaction etx = em.getTransaction();
        
        try{
            etx.begin();
            bussinessLogic(em);
            etx.commit();
        }catch(Exception e){ 
            e.printStackTrace();
            etx.rollback();
        }finally{
            em.close();
        }
        emf.close();
    }

    public static void bussinessLogic(EntityManager em) {

        String id = "id2";
        Member_Auth member  = new Member_Auth();
        member.setId(id);
        member.setUserName("나얼");
        member.setAge(18);
        
        em.persist(member);
        
        //한 건 조회
        Member_Auth findMember = em.find(Member_Auth.class, id);
        System.out.println("findMember=" + findMember.getUserName() + ", age=" + findMember.getAge());

        //수정
        member.setAge(20);
        System.out.println("findMember=" + findMember.getUserName() + ", age=" + findMember.getAge());
        
        //목록 조회
        List<Member> members = em.createQuery("select m from Member m", Member.class).getResultList();
        System.out.println("members.size=" + members.size());

        //삭제
        em.remove(member);
    }
}
