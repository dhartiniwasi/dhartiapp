package p265j6;

import android.os.Build;

/* renamed from: j6.c */
/* compiled from: CircularRevealHelper */
public class C11488c {

    /* renamed from: a */
    public static final int f43905a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            f43905a = 2;
        } else if (i >= 18) {
            f43905a = 1;
        } else {
            f43905a = 0;
        }
    }
}
