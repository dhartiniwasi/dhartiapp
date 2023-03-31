package p354se;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import androidx.core.app.C0665o;
import androidx.work.C1536b;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C11665g;
import kotlin.jvm.internal.C11669k;
import p170y0.C6082a;
import p170y0.C6083b;
import p170y0.C6096k;
import p170y0.C6097l;
import p170y0.C6111t;
import p170y0.C6112u;
import p186ac.C6539c;
import p186ac.C6555j;
import p186ac.C6556k;
import p243gd.C10349s;
import p351sb.C12502a;
import p383vn.hunghd.flutterdownloader.DownloadWorker;

/* renamed from: se.g */
/* compiled from: FlutterDownloaderPlugin.kt */
public final class C12524g implements C6556k.C6560c, C12502a {

    /* renamed from: i */
    public static final C12525a f46008i = new C12525a((C11665g) null);

    /* renamed from: a */
    private C6556k f46009a;

    /* renamed from: b */
    private C12528j f46010b;

    /* renamed from: c */
    private Context f46011c;

    /* renamed from: d */
    private long f46012d;

    /* renamed from: e */
    private int f46013e;

    /* renamed from: f */
    private int f46014f;

    /* renamed from: g */
    private int f46015g;

    /* renamed from: h */
    private final Object f46016h = new Object();

    /* renamed from: se.g$a */
    /* compiled from: FlutterDownloaderPlugin.kt */
    public static final class C12525a {
        private C12525a() {
        }

        public /* synthetic */ C12525a(C11665g gVar) {
            this();
        }
    }

    /* renamed from: a */
    private final C6112u m59691a(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, boolean z6) {
        C6097l.C6098a aVar = (C6097l.C6098a) ((C6097l.C6098a) ((C6097l.C6098a) new C6097l.C6098a(DownloadWorker.class).mo20950f(new C6083b.C6084a().mo20902c(z4).mo20901b(z6 ? C6096k.CONNECTED : C6096k.UNMETERED).mo20900a())).mo20947a("flutter_download_task")).mo20949e(C6082a.EXPONENTIAL, 10, TimeUnit.SECONDS);
        C1536b.C1537a f = new C1536b.C1537a().mo6316h("url", str).mo6316h("saved_file", str2).mo6316h("file_name", str3).mo6316h("headers", str4).mo6313e("show_notification", z).mo6313e("open_file_from_notification", z2).mo6313e("is_resume", z3).mo6315g("callback_handle", this.f46012d).mo6314f("step", this.f46013e);
        boolean z7 = false;
        C1536b.C1537a e = f.mo6313e("debug", this.f46014f == 1);
        if (this.f46015g == 1) {
            z7 = true;
        }
        C6112u b = ((C6097l.C6098a) aVar.mo20952h(e.mo6313e("ignoreSsl", z7).mo6313e("save_in_public_storage", z5).mo6314f("timeout", i).mo6309a())).mo20948b();
        C11669k.m56786d(b, "Builder(DownloadWorker::…   )\n            .build()");
        return b;
    }

    /* renamed from: b */
    private final void m59692b(C6555j jVar, C6556k.C6561d dVar) {
        C6111t.m35740g(m59705o()).mo20938b(UUID.fromString((String) m59704n(jVar, "task_id")));
        dVar.success((Object) null);
    }

    /* renamed from: c */
    private final void m59693c(C6556k.C6561d dVar) {
        C6111t.m35740g(m59705o()).mo20937a("flutter_download_task");
        dVar.success((Object) null);
    }

    /* renamed from: d */
    private final void m59694d(File file) {
        String[] strArr = {"_id"};
        String absolutePath = file.getAbsolutePath();
        C11669k.m56786d(absolutePath, "file.absolutePath");
        String[] strArr2 = {absolutePath};
        Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        C11669k.m56786d(uri, "EXTERNAL_CONTENT_URI");
        ContentResolver contentResolver = m59705o().getContentResolver();
        C11669k.m56786d(contentResolver, "requireContext().contentResolver");
        Cursor query = contentResolver.query(uri, strArr, "_data = ?", strArr2, (String) null);
        if (query == null || !query.moveToFirst()) {
            Cursor query2 = contentResolver.query(uri, strArr, "_data = ?", strArr2, (String) null);
            if (query2 != null && query2.moveToFirst()) {
                Uri withAppendedId = ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, query2.getLong(query2.getColumnIndexOrThrow("_id")));
                C11669k.m56786d(withAppendedId, "withAppendedId(MediaStor…EXTERNAL_CONTENT_URI, id)");
                contentResolver.delete(withAppendedId, (String) null, (String[]) null);
            }
            if (query2 != null) {
                query2.close();
            }
        } else {
            Uri withAppendedId2 = ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, query.getLong(query.getColumnIndexOrThrow("_id")));
            C11669k.m56786d(withAppendedId2, "withAppendedId(MediaStor…EXTERNAL_CONTENT_URI, id)");
            contentResolver.delete(withAppendedId2, (String) null, (String[]) null);
        }
        if (query != null) {
            query.close();
        }
    }

    /* renamed from: e */
    private final void m59695e(C6555j jVar, C6556k.C6561d dVar) {
        C6555j jVar2 = jVar;
        String str = (String) m59704n(jVar2, "url");
        String str2 = (String) m59704n(jVar2, "saved_dir");
        String str3 = (String) jVar2.mo22156a("file_name");
        String str4 = (String) m59704n(jVar2, "headers");
        int intValue = ((Number) m59704n(jVar2, "timeout")).intValue();
        boolean booleanValue = ((Boolean) m59704n(jVar2, "show_notification")).booleanValue();
        boolean booleanValue2 = ((Boolean) m59704n(jVar2, "open_file_from_notification")).booleanValue();
        boolean booleanValue3 = ((Boolean) m59704n(jVar2, "requires_storage_not_low")).booleanValue();
        boolean booleanValue4 = ((Boolean) m59704n(jVar2, "save_in_public_storage")).booleanValue();
        boolean booleanValue5 = ((Boolean) m59704n(jVar2, "allow_cellular")).booleanValue();
        C6112u a = m59691a(str, str2, str3, str4, booleanValue, booleanValue2, false, booleanValue3, booleanValue4, intValue, booleanValue5);
        C6111t.m35740g(m59705o()).mo20940d(a);
        String uuid = a.mo20943a().toString();
        C11669k.m56786d(uuid, "request.id.toString()");
        dVar.success(uuid);
        C12518a aVar = C12518a.ENQUEUED;
        m59708r(uuid, aVar, 0);
        C12528j jVar3 = this.f46010b;
        C11669k.m56784b(jVar3);
        jVar3.mo37331b(uuid, str, aVar, 0, str3, str2, str4, booleanValue, booleanValue2, booleanValue4, booleanValue5);
    }

    /* renamed from: f */
    private final void m59696f(C6555j jVar, C6556k.C6561d dVar) {
        SharedPreferences.Editor edit;
        SharedPreferences.Editor putLong;
        Object obj = jVar.f31000b;
        C11669k.m56785c(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
        List list = (List) obj;
        long parseLong = Long.parseLong(String.valueOf(list.get(0)));
        this.f46014f = Integer.parseInt(String.valueOf(list.get(1)));
        this.f46015g = Integer.parseInt(String.valueOf(list.get(2)));
        Context context = this.f46011c;
        SharedPreferences sharedPreferences = context != null ? context.getSharedPreferences("vn.hunghd.downloader.pref", 0) : null;
        if (!(sharedPreferences == null || (edit = sharedPreferences.edit()) == null || (putLong = edit.putLong("callback_dispatcher_handle_key", parseLong)) == null)) {
            putLong.apply();
        }
        dVar.success((Object) null);
    }

    /* renamed from: g */
    private final void m59697g(C6556k.C6561d dVar) {
        C12528j jVar = this.f46010b;
        C11669k.m56784b(jVar);
        List<C12520c> c = jVar.mo37332c();
        ArrayList arrayList = new ArrayList();
        for (C12520c next : c) {
            HashMap hashMap = new HashMap();
            hashMap.put("task_id", next.mo37322m());
            hashMap.put("status", Integer.valueOf(next.mo37321l().ordinal()));
            hashMap.put("progress", Integer.valueOf(next.mo37315g()));
            hashMap.put("url", next.mo37324o());
            hashMap.put("file_name", next.mo37309b());
            hashMap.put("saved_dir", next.mo37319j());
            hashMap.put("time_created", Long.valueOf(next.mo37323n()));
            hashMap.put("allow_cellular", Boolean.valueOf(next.mo37308a()));
            arrayList.add(hashMap);
        }
        dVar.success(arrayList);
    }

    /* renamed from: h */
    private final void m59698h(C6555j jVar, C6556k.C6561d dVar) {
        C12528j jVar2 = this.f46010b;
        C11669k.m56784b(jVar2);
        List<C12520c> e = jVar2.mo37334e((String) m59704n(jVar, "query"));
        ArrayList arrayList = new ArrayList();
        for (C12520c next : e) {
            HashMap hashMap = new HashMap();
            hashMap.put("task_id", next.mo37322m());
            hashMap.put("status", Integer.valueOf(next.mo37321l().ordinal()));
            hashMap.put("progress", Integer.valueOf(next.mo37315g()));
            hashMap.put("url", next.mo37324o());
            hashMap.put("file_name", next.mo37309b());
            hashMap.put("saved_dir", next.mo37319j());
            hashMap.put("time_created", Long.valueOf(next.mo37323n()));
            hashMap.put("allow_cellular", Boolean.valueOf(next.mo37308a()));
            arrayList.add(hashMap);
        }
        dVar.success(arrayList);
    }

    /* renamed from: i */
    private final void m59699i(Context context, C6539c cVar) {
        synchronized (this.f46016h) {
            if (this.f46009a == null) {
                this.f46011c = context;
                C6556k kVar = new C6556k(cVar, "vn.hunghd/downloader");
                this.f46009a = kVar;
                kVar.mo22161e(this);
                this.f46010b = new C12528j(C12529k.f46020a.mo37342a(this.f46011c));
                C10349s sVar = C10349s.f40964a;
            }
        }
    }

    /* renamed from: j */
    private final void m59700j(C6555j jVar, C6556k.C6561d dVar) {
        String str = (String) m59704n(jVar, "task_id");
        C12528j jVar2 = this.f46010b;
        C11669k.m56784b(jVar2);
        C12520c d = jVar2.mo37333d(str);
        if (d == null) {
            dVar.error("invalid_task_id", "not found task with id " + str, (Object) null);
        } else if (d.mo37321l() != C12518a.COMPLETE) {
            dVar.error("invalid_status", "only completed tasks can be opened", (Object) null);
        } else {
            String o = d.mo37324o();
            String j = d.mo37319j();
            String b = d.mo37309b();
            if (b == null) {
                b = o.substring(C13011o.m61265E(o, "/", 0, false, 6, (Object) null) + 1, o.length());
                C11669k.m56786d(b, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            Intent c = C12526h.f46017a.mo37329c(m59705o(), j + File.separator + b, d.mo37311d());
            if (c != null) {
                m59705o().startActivity(c);
                dVar.success(Boolean.TRUE);
                return;
            }
            dVar.success(Boolean.FALSE);
        }
    }

    /* renamed from: k */
    private final void m59701k(C6555j jVar, C6556k.C6561d dVar) {
        String str = (String) m59704n(jVar, "task_id");
        C12528j jVar2 = this.f46010b;
        C11669k.m56784b(jVar2);
        jVar2.mo37338j(str, true);
        C6111t.m35740g(m59705o()).mo20938b(UUID.fromString(str));
        dVar.success((Object) null);
    }

    /* renamed from: l */
    private final void m59702l(C6555j jVar, C6556k.C6561d dVar) {
        Object obj = jVar.f31000b;
        C11669k.m56785c(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
        List list = (List) obj;
        this.f46012d = Long.parseLong(String.valueOf(list.get(0)));
        this.f46013e = Integer.parseInt(String.valueOf(list.get(1)));
        dVar.success((Object) null);
    }

    /* renamed from: m */
    private final void m59703m(C6555j jVar, C6556k.C6561d dVar) {
        String str = (String) m59704n(jVar, "task_id");
        boolean booleanValue = ((Boolean) m59704n(jVar, "should_delete_content")).booleanValue();
        C12528j jVar2 = this.f46010b;
        C11669k.m56784b(jVar2);
        C12520c d = jVar2.mo37333d(str);
        if (d != null) {
            if (d.mo37321l() == C12518a.ENQUEUED || d.mo37321l() == C12518a.RUNNING) {
                C6111t.m35740g(m59705o()).mo20938b(UUID.fromString(str));
            }
            if (booleanValue) {
                String b = d.mo37309b();
                if (b == null) {
                    b = d.mo37324o().substring(C13011o.m61265E(d.mo37324o(), "/", 0, false, 6, (Object) null) + 1, d.mo37324o().length());
                    C11669k.m56786d(b, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                File file = new File(d.mo37319j() + File.separator + b);
                if (file.exists()) {
                    m59694d(file);
                    file.delete();
                }
            }
            C12528j jVar3 = this.f46010b;
            C11669k.m56784b(jVar3);
            jVar3.mo37330a(str);
            C0665o.m3094e(m59705o()).mo2966b(d.mo37314f());
            dVar.success((Object) null);
            return;
        }
        dVar.error("invalid_task_id", "not found task corresponding to given task id", (Object) null);
    }

    /* renamed from: n */
    private final <T> T m59704n(C6555j jVar, String str) {
        T a = jVar.mo22156a(str);
        if (a != null) {
            return a;
        }
        throw new IllegalArgumentException(("Required key '" + str + "' was null").toString());
    }

    /* renamed from: o */
    private final Context m59705o() {
        Context context = this.f46011c;
        if (context != null) {
            return context;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* renamed from: p */
    private final void m59706p(C6555j jVar, C6556k.C6561d dVar) {
        C6555j jVar2 = jVar;
        C6556k.C6561d dVar2 = dVar;
        String str = (String) m59704n(jVar2, "task_id");
        C12528j jVar3 = this.f46010b;
        C11669k.m56784b(jVar3);
        C12520c d = jVar3.mo37333d(str);
        boolean booleanValue = ((Boolean) m59704n(jVar2, "requires_storage_not_low")).booleanValue();
        int intValue = ((Number) m59704n(jVar2, "timeout")).intValue();
        if (d == null) {
            dVar2.error("invalid_task_id", "not found task corresponding to given task id", (Object) null);
        } else if (d.mo37321l() == C12518a.PAUSED) {
            String b = d.mo37309b();
            if (b == null) {
                b = d.mo37324o().substring(C13011o.m61265E(d.mo37324o(), "/", 0, false, 6, (Object) null) + 1, d.mo37324o().length());
                C11669k.m56786d(b, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            if (new File(d.mo37319j() + File.separator + b).exists()) {
                C6112u a = m59691a(d.mo37324o(), d.mo37319j(), d.mo37309b(), d.mo37310c(), d.mo37320k(), d.mo37312e(), true, booleanValue, d.mo37318i(), intValue, d.mo37308a());
                String uuid = a.mo20943a().toString();
                C11669k.m56786d(uuid, "request.id.toString()");
                dVar2.success(uuid);
                C12518a aVar = C12518a.RUNNING;
                m59708r(uuid, aVar, d.mo37315g());
                C12528j jVar4 = this.f46010b;
                C11669k.m56784b(jVar4);
                jVar4.mo37336h(str, uuid, aVar, d.mo37315g(), false);
                C6111t.m35740g(m59705o()).mo20940d(a);
                return;
            }
            C12528j jVar5 = this.f46010b;
            C11669k.m56784b(jVar5);
            jVar5.mo37338j(str, false);
            dVar2.error("invalid_data", "not found partial downloaded data, this task cannot be resumed", (Object) null);
        } else {
            dVar2.error("invalid_status", "only paused task can be resumed", (Object) null);
        }
    }

    /* renamed from: q */
    private final void m59707q(C6555j jVar, C6556k.C6561d dVar) {
        C6555j jVar2 = jVar;
        C6556k.C6561d dVar2 = dVar;
        String str = (String) m59704n(jVar2, "task_id");
        C12528j jVar3 = this.f46010b;
        C11669k.m56784b(jVar3);
        C12520c d = jVar3.mo37333d(str);
        boolean booleanValue = ((Boolean) m59704n(jVar2, "requires_storage_not_low")).booleanValue();
        int intValue = ((Number) m59704n(jVar2, "timeout")).intValue();
        if (d == null) {
            dVar2.error("invalid_task_id", "not found task corresponding to given task id", (Object) null);
        } else if (d.mo37321l() == C12518a.FAILED || d.mo37321l() == C12518a.CANCELED) {
            C6112u a = m59691a(d.mo37324o(), d.mo37319j(), d.mo37309b(), d.mo37310c(), d.mo37320k(), d.mo37312e(), false, booleanValue, d.mo37318i(), intValue, d.mo37308a());
            String uuid = a.mo20943a().toString();
            C11669k.m56786d(uuid, "request.id.toString()");
            dVar2.success(uuid);
            C12518a aVar = C12518a.ENQUEUED;
            m59708r(uuid, aVar, d.mo37315g());
            C12528j jVar4 = this.f46010b;
            C11669k.m56784b(jVar4);
            jVar4.mo37336h(str, uuid, aVar, d.mo37315g(), false);
            C6111t.m35740g(m59705o()).mo20940d(a);
        } else {
            dVar2.error("invalid_status", "only failed and canceled task can be retried", (Object) null);
        }
    }

    /* renamed from: r */
    private final void m59708r(String str, C12518a aVar, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("task_id", str);
        hashMap.put("status", Integer.valueOf(aVar.ordinal()));
        hashMap.put("progress", Integer.valueOf(i));
        C6556k kVar = this.f46009a;
        if (kVar != null) {
            kVar.mo22159c("updateProgress", hashMap);
        }
    }

    public void onAttachedToEngine(C12502a.C12504b bVar) {
        C11669k.m56787e(bVar, "binding");
        Context a = bVar.mo37292a();
        C6539c b = bVar.mo37293b();
        C11669k.m56786d(b, "binding.binaryMessenger");
        m59699i(a, b);
    }

    public void onDetachedFromEngine(C12502a.C12504b bVar) {
        C11669k.m56787e(bVar, "binding");
        this.f46011c = null;
        C6556k kVar = this.f46009a;
        if (kVar != null) {
            kVar.mo22161e((C6556k.C6560c) null);
        }
        this.f46009a = null;
    }

    public void onMethodCall(C6555j jVar, C6556k.C6561d dVar) {
        C11669k.m56787e(jVar, "call");
        C11669k.m56787e(dVar, "result");
        String str = jVar.f30999a;
        if (str != null) {
            switch (str.hashCode()) {
                case -1594257912:
                    if (str.equals("enqueue")) {
                        m59695e(jVar, dVar);
                        return;
                    }
                    break;
                case -1367724422:
                    if (str.equals("cancel")) {
                        m59692b(jVar, dVar);
                        return;
                    }
                    break;
                case -934610812:
                    if (str.equals("remove")) {
                        m59703m(jVar, dVar);
                        return;
                    }
                    break;
                case -934426579:
                    if (str.equals("resume")) {
                        m59706p(jVar, dVar);
                        return;
                    }
                    break;
                case -403218424:
                    if (str.equals("registerCallback")) {
                        m59702l(jVar, dVar);
                        return;
                    }
                    break;
                case 3417674:
                    if (str.equals("open")) {
                        m59700j(jVar, dVar);
                        return;
                    }
                    break;
                case 106440182:
                    if (str.equals("pause")) {
                        m59701k(jVar, dVar);
                        return;
                    }
                    break;
                case 108405416:
                    if (str.equals("retry")) {
                        m59707q(jVar, dVar);
                        return;
                    }
                    break;
                case 230377166:
                    if (str.equals("loadTasksWithRawQuery")) {
                        m59698h(jVar, dVar);
                        return;
                    }
                    break;
                case 476547271:
                    if (str.equals("cancelAll")) {
                        m59693c(dVar);
                        return;
                    }
                    break;
                case 871091088:
                    if (str.equals("initialize")) {
                        m59696f(jVar, dVar);
                        return;
                    }
                    break;
                case 1378870856:
                    if (str.equals("loadTasks")) {
                        m59697g(dVar);
                        return;
                    }
                    break;
            }
        }
        dVar.notImplemented();
    }
}
