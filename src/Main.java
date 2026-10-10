import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        LocalDateTime plussed = dt.plus(10, ChronoUnit.MINUTES);

        System.out.println(plussed);
    }
}