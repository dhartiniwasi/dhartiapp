package p067i5;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* renamed from: i5.q */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class C4703q {

    /* renamed from: a */
    private static final Pattern f25263a = Pattern.compile("\\$\\{(.*?)\\}");

    /* renamed from: a */
    public static String m30425a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    /* renamed from: b */
    public static boolean m30426b(String str) {
        return str == null || str.trim().isEmpty();
    }
}
