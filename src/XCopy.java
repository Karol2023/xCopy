//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class XCopy {
    public static void main(String[] args) {

        int org = 42;
        XCopy x = new XCopy();

        int y = x.drive(org);
        System.out.println(org + "" + y);

    }
        int drive(int arg) {
        arg = arg * 2;
        return arg;
        }
}