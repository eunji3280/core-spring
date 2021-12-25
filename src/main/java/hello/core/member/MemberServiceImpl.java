package hello.core.member;

//구현체가 한개만 있을경우에 인터페이스명뒤에 Impl이라고 많이쓴다. 관례
public class MemberServiceImpl implements MemberService{

    //인터페이스를 의존. 실제 할당하는부분이 구현체를 의존.
    //추상화에도 의존하고 구체화에도 의존하고있음.
    //나중에 변경할때 문제가있다. DIP를 위반하고있음.??????
    private final MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
