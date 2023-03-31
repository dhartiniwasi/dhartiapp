package androidx.work.impl.workers;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p050g1.C4314g;
import p050g1.C4315h;
import p050g1.C4320k;
import p050g1.C4329p;
import p050g1.C4332q;
import p050g1.C4344t;
import p170y0.C6094j;
import p176z0.C6191i;

public class DiagnosticsWorker extends Worker {

    /* renamed from: g */
    private static final String f4570g = C6094j.m35719f("DiagnosticsWrkr");

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* renamed from: a */
    private static String m7319a(C4329p pVar, String str, Integer num, String str2) {
        return String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", new Object[]{pVar.f24215a, pVar.f24217c, num, pVar.f24216b.name(), str, str2});
    }

    /* renamed from: c */
    private static String m7320c(C4320k kVar, C4344t tVar, C4315h hVar, List<C4329p> list) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", new Object[]{Build.VERSION.SDK_INT >= 23 ? "Job Id" : "Alarm Id"}));
        for (C4329p next : list) {
            Integer num = null;
            C4314g c = hVar.mo17733c(next.f24215a);
            if (c != null) {
                num = Integer.valueOf(c.f24193b);
            }
            sb.append(m7319a(next, TextUtils.join(",", kVar.mo17737b(next.f24215a)), num, TextUtils.join(",", tVar.mo17775a(next.f24215a))));
        }
        return sb.toString();
    }

    public ListenableWorker.C1526a doWork() {
        WorkDatabase q = C6191i.m36023m(getApplicationContext()).mo21130q();
        C4332q B = q.mo6318B();
        C4320k z = q.mo6323z();
        C4344t C = q.mo6319C();
        C4315h y = q.mo6322y();
        List<C4329p> e = B.mo17757e(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1));
        List<C4329p> j = B.mo17762j();
        List<C4329p> t = B.mo17772t(200);
        if (e != null && !e.isEmpty()) {
            C6094j c = C6094j.m35717c();
            String str = f4570g;
            c.mo20923d(str, "Recently completed work:\n\n", new Throwable[0]);
            C6094j.m35717c().mo20923d(str, m7320c(z, C, y, e), new Throwable[0]);
        }
        if (j != null && !j.isEmpty()) {
            C6094j c2 = C6094j.m35717c();
            String str2 = f4570g;
            c2.mo20923d(str2, "Running work:\n\n", new Throwable[0]);
            C6094j.m35717c().mo20923d(str2, m7320c(z, C, y, j), new Throwable[0]);
        }
        if (t != null && !t.isEmpty()) {
            C6094j c3 = C6094j.m35717c();
            String str3 = f4570g;
            c3.mo20923d(str3, "Enqueued work:\n\n", new Throwable[0]);
            C6094j.m35717c().mo20923d(str3, m7320c(z, C, y, t), new Throwable[0]);
        }
        return ListenableWorker.C1526a.m7085c();
    }
}
