package dialogs;

import java.util.List;

public class StringSelectDialog extends AbstractDialog<String> {

    public StringSelectDialog(String title, String error, List<String> keys) {
        super(title,
                error,
                s -> s,
                s -> getValidator(s,keys)
        );
    }

    private static boolean getValidator(String s, List<String> keys) {
        for (String key : keys) {
            if (key.equalsIgnoreCase(s)) {
                return true;
            }
        }
        return false;
    }
}
