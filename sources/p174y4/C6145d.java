package p174y4;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p124r.C5426g;
import p130r5.C5463a;
import p218e6.C9975i;
import p218e6.C9977j;
import p218e6.C9980l;

/* renamed from: y4.d */
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public class C6145d {

    /* renamed from: h */
    private static int f29580h;

    /* renamed from: i */
    private static PendingIntent f29581i;

    /* renamed from: j */
    private static final Executor f29582j = C6148e0.f29592a;

    /* renamed from: k */
    private static final Pattern f29583k = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* renamed from: a */
    private final C5426g<String, C9977j<Bundle>> f29584a = new C5426g<>();

    /* renamed from: b */
    private final Context f29585b;

    /* renamed from: c */
    private final C6168y f29586c;

    /* renamed from: d */
    private final ScheduledExecutorService f29587d;

    /* renamed from: e */
    private Messenger f29588e;

    /* renamed from: f */
    private Messenger f29589f;

    /* renamed from: g */
    private C6152i f29590g;

    public C6145d(Context context) {
        this.f29585b = context;
        this.f29586c = new C6168y(context);
        this.f29588e = new Messenger(new C6149f(this, Looper.getMainLooper()));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f29587d = scheduledThreadPoolExecutor;
    }

    /* renamed from: b */
    static /* synthetic */ C9975i m35827b(Bundle bundle) throws Exception {
        if (m35833j(bundle)) {
            return C9980l.m51031e(null);
        }
        return C9980l.m51031e(bundle);
    }

    /* renamed from: d */
    static /* bridge */ /* synthetic */ void m35828d(C6145d dVar, Message message) {
        String str;
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new C6151h());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof C6152i) {
                        dVar.f29590g = (C6152i) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        dVar.f29589f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if ("com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    String stringExtra = intent2.getStringExtra("registration_id");
                    if (stringExtra == null) {
                        stringExtra = intent2.getStringExtra("unregistered");
                    }
                    if (stringExtra == null) {
                        String stringExtra2 = intent2.getStringExtra("error");
                        if (stringExtra2 == null) {
                            String valueOf = String.valueOf(intent2.getExtras());
                            StringBuilder sb = new StringBuilder(valueOf.length() + 49);
                            sb.append("Unexpected response, no error or registration id ");
                            sb.append(valueOf);
                            Log.w("Rpc", sb.toString());
                            return;
                        }
                        if (Log.isLoggable("Rpc", 3)) {
                            if (stringExtra2.length() != 0) {
                                str = "Received InstanceID error ".concat(stringExtra2);
                            } else {
                                str = new String("Received InstanceID error ");
                            }
                            Log.d("Rpc", str);
                        }
                        if (stringExtra2.startsWith("|")) {
                            String[] split = stringExtra2.split("\\|");
                            if (split.length <= 2 || !"ID".equals(split[1])) {
                                Log.w("Rpc", stringExtra2.length() != 0 ? "Unexpected structured response ".concat(stringExtra2) : new String("Unexpected structured response "));
                                return;
                            }
                            String str2 = split[2];
                            String str3 = split[3];
                            if (str3.startsWith(":")) {
                                str3 = str3.substring(1);
                            }
                            dVar.m35832i(str2, intent2.putExtra("error", str3).getExtras());
                            return;
                        }
                        synchronized (dVar.f29584a) {
                            for (int i = 0; i < dVar.f29584a.size(); i++) {
                                dVar.m35832i(dVar.f29584a.mo19668j(i), intent2.getExtras());
                            }
                        }
                        return;
                    }
                    Matcher matcher = f29583k.matcher(stringExtra);
                    if (matcher.matches()) {
                        String group = matcher.group(1);
                        String group2 = matcher.group(2);
                        if (group != null) {
                            Bundle extras = intent2.getExtras();
                            extras.putString("registration_id", group2);
                            dVar.m35832i(group, extras);
                            return;
                        }
                        return;
                    } else if (Log.isLoggable("Rpc", 3)) {
                        Log.d("Rpc", stringExtra.length() != 0 ? "Unexpected response string: ".concat(stringExtra) : new String("Unexpected response string: "));
                        return;
                    } else {
                        return;
                    }
                } else if (Log.isLoggable("Rpc", 3)) {
                    String valueOf2 = String.valueOf(action);
                    Log.d("Rpc", valueOf2.length() != 0 ? "Unexpected response action: ".concat(valueOf2) : new String("Unexpected response action: "));
                    return;
                } else {
                    return;
                }
            }
        }
        Log.w("Rpc", "Dropping invalid message");
    }

    /* renamed from: f */
    private final C9975i<Bundle> m35829f(Bundle bundle) {
        String g = m35830g();
        C9977j jVar = new C9977j();
        synchronized (this.f29584a) {
            this.f29584a.put(g, jVar);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f29586c.mo21047b() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        m35831h(this.f29585b, intent);
        StringBuilder sb = new StringBuilder(String.valueOf(g).length() + 5);
        sb.append("|ID|");
        sb.append(g);
        sb.append("|");
        intent.putExtra("kid", sb.toString());
        if (Log.isLoggable("Rpc", 3)) {
            String valueOf = String.valueOf(intent.getExtras());
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 8);
            sb2.append("Sending ");
            sb2.append(valueOf);
            Log.d("Rpc", sb2.toString());
        }
        intent.putExtra("google.messenger", this.f29588e);
        if (!(this.f29589f == null && this.f29590g == null)) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f29589f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    this.f29590g.mo21017b(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            jVar.mo32542a().mo26348c(f29582j, new C6141b0(this, g, this.f29587d.schedule(new C6146d0(jVar), 30, TimeUnit.SECONDS)));
            return jVar.mo32542a();
        }
        if (this.f29586c.mo21047b() == 2) {
            this.f29585b.sendBroadcast(intent);
        } else {
            this.f29585b.startService(intent);
        }
        jVar.mo32542a().mo26348c(f29582j, new C6141b0(this, g, this.f29587d.schedule(new C6146d0(jVar), 30, TimeUnit.SECONDS)));
        return jVar.mo32542a();
    }

    /* renamed from: g */
    private static synchronized String m35830g() {
        String num;
        synchronized (C6145d.class) {
            int i = f29580h;
            f29580h = i + 1;
            num = Integer.toString(i);
        }
        return num;
    }

    /* renamed from: h */
    private static synchronized void m35831h(Context context, Intent intent) {
        synchronized (C6145d.class) {
            if (f29581i == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f29581i = C5463a.m33404a(context, 0, intent2, C5463a.f27788a);
            }
            intent.putExtra("app", f29581i);
        }
    }

    /* renamed from: i */
    private final void m35832i(String str, Bundle bundle) {
        String str2;
        synchronized (this.f29584a) {
            C9977j remove = this.f29584a.remove(str);
            if (remove == null) {
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    str2 = "Missing callback for ".concat(valueOf);
                } else {
                    str2 = new String("Missing callback for ");
                }
                Log.w("Rpc", str2);
                return;
            }
            remove.mo32544c(bundle);
        }
    }

    /* renamed from: j */
    private static boolean m35833j(Bundle bundle) {
        return bundle != null && bundle.containsKey("google.messenger");
    }

    /* renamed from: a */
    public C9975i<Bundle> mo21005a(Bundle bundle) {
        if (this.f29586c.mo21046a() >= 12000000) {
            return C6167x.m35856b(this.f29585b).mo21045d(1, bundle).mo26354i(f29582j, C6139a0.f29573a);
        }
        if (this.f29586c.mo21047b() != 0) {
            return m35829f(bundle).mo26356k(f29582j, new C6169z(this, bundle));
        }
        return C9980l.m51030d(new IOException("MISSING_INSTANCEID_SERVICE"));
    }

    /* renamed from: c */
    public final /* synthetic */ C9975i mo21006c(Bundle bundle, C9975i iVar) throws Exception {
        if (iVar.mo26362q() && m35833j((Bundle) iVar.mo26358m())) {
            return m35829f(bundle).mo26364s(f29582j, C6144c0.f29579a);
        }
        return iVar;
    }

    /* renamed from: e */
    public final /* synthetic */ void mo21007e(String str, ScheduledFuture scheduledFuture, C9975i iVar) {
        synchronized (this.f29584a) {
            this.f29584a.remove(str);
        }
        scheduledFuture.cancel(false);
    }
}
