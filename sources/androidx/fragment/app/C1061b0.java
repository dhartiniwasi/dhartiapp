package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* renamed from: androidx.fragment.app.b0 */
/* compiled from: LogWriter */
final class C1061b0 extends Writer {

    /* renamed from: a */
    private final String f2911a;

    /* renamed from: b */
    private StringBuilder f2912b = new StringBuilder(128);

    C1061b0(String str) {
        this.f2911a = str;
    }

    /* renamed from: a */
    private void m4837a() {
        if (this.f2912b.length() > 0) {
            Log.d(this.f2911a, this.f2912b.toString());
            StringBuilder sb = this.f2912b;
            sb.delete(0, sb.length());
        }
    }

    public void close() {
        m4837a();
    }

    public void flush() {
        m4837a();
    }

    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == 10) {
                m4837a();
            } else {
                this.f2912b.append(c);
            }
        }
    }
}
