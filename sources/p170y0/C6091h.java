package p170y0;

import androidx.work.C1536b;
import java.util.List;

/* renamed from: y0.h */
/* compiled from: InputMerger */
public abstract class C6091h {

    /* renamed from: a */
    private static final String f29482a = C6094j.m35719f("InputMerger");

    /* renamed from: a */
    public static C6091h m35711a(String str) {
        try {
            return (C6091h) Class.forName(str).newInstance();
        } catch (Exception e) {
            C6094j c = C6094j.m35717c();
            String str2 = f29482a;
            c.mo20922b(str2, "Trouble instantiating + " + str, e);
            return null;
        }
    }

    /* renamed from: b */
    public abstract C1536b mo6236b(List<C1536b> list);
}
