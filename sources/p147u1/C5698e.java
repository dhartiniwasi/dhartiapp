package p147u1;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;
import p098n1.C5095o;
import p126r1.C5431a;
import p153v1.C5761d;
import p171y1.C6116a;

/* renamed from: u1.e */
/* compiled from: JobInfoScheduler */
public class C5698e implements C5708y {

    /* renamed from: a */
    private final Context f28461a;

    /* renamed from: b */
    private final C5761d f28462b;

    /* renamed from: c */
    private final C5699g f28463c;

    public C5698e(Context context, C5761d dVar, C5699g gVar) {
        this.f28461a = context;
        this.f28462b = dVar;
        this.f28463c = gVar;
    }

    /* renamed from: d */
    private boolean m33982d(JobScheduler jobScheduler, int i, int i2) {
        for (JobInfo next : jobScheduler.getAllPendingJobs()) {
            int i3 = next.getExtras().getInt("attemptNumber");
            if (next.getId() == i) {
                if (i3 >= i2) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo20073a(C5095o oVar, int i, boolean z) {
        ComponentName componentName = new ComponentName(this.f28461a, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f28461a.getSystemService("jobscheduler");
        int c = mo20091c(oVar);
        if (z || !m33982d(jobScheduler, c, i)) {
            long C0 = this.f28462b.mo20263C0(oVar);
            JobInfo.Builder c2 = this.f28463c.mo20092c(new JobInfo.Builder(c, componentName), oVar.mo19026d(), C0, i);
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", oVar.mo19024b());
            persistableBundle.putInt("priority", C6116a.m35764a(oVar.mo19026d()));
            if (oVar.mo19025c() != null) {
                persistableBundle.putString("extras", Base64.encodeToString(oVar.mo19025c(), 0));
            }
            c2.setExtras(persistableBundle);
            C5431a.m33268c("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", oVar, Integer.valueOf(c), Long.valueOf(this.f28463c.mo20093g(oVar.mo19026d(), C0, i)), Long.valueOf(C0), Integer.valueOf(i));
            jobScheduler.schedule(c2.build());
            return;
        }
        C5431a.m33267b("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", oVar);
    }

    /* renamed from: b */
    public void mo20074b(C5095o oVar, int i) {
        mo20073a(oVar, i, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo20091c(C5095o oVar) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f28461a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(oVar.mo19024b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(C6116a.m35764a(oVar.mo19026d())).array());
        if (oVar.mo19025c() != null) {
            adler32.update(oVar.mo19025c());
        }
        return (int) adler32.getValue();
    }
}
