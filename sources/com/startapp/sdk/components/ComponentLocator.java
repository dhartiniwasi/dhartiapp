package com.startapp.sdk.components;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.startapp.C8870c1;
import com.startapp.C8871c2;
import com.startapp.C8873c3;
import com.startapp.C8886c9;
import com.startapp.C8897d;
import com.startapp.C8898d0;
import com.startapp.C8908d3;
import com.startapp.C8910d5;
import com.startapp.C8911d6;
import com.startapp.C8923e2;
import com.startapp.C8997h4;
import com.startapp.C9000h7;
import com.startapp.C9007ha;
import com.startapp.C9045j6;
import com.startapp.C9047j7;
import com.startapp.C9058k0;
import com.startapp.C9059k1;
import com.startapp.C9090kb;
import com.startapp.C9094kd;
import com.startapp.C9111l4;
import com.startapp.C9116l9;
import com.startapp.C9123m;
import com.startapp.C9130m5;
import com.startapp.C9139md;
import com.startapp.C9185o4;
import com.startapp.C9245q9;
import com.startapp.C9246qa;
import com.startapp.C9256r3;
import com.startapp.C9275s3;
import com.startapp.C9277s5;
import com.startapp.C9545t;
import com.startapp.C9550t3;
import com.startapp.C9558ta;
import com.startapp.C9579u4;
import com.startapp.C9636x4;
import com.startapp.C9641x9;
import com.startapp.C9648y;
import com.startapp.C9654y3;
import com.startapp.C9661y8;
import com.startapp.C9667ye;
import com.startapp.C9672z1;
import com.startapp.C9688ze;
import com.startapp.sdk.ads.video.C9364h;
import com.startapp.sdk.adsbase.C9441e;
import com.startapp.sdk.adsbase.cache.C9410d;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.crashreport.ANRRemoteConfig;
import com.startapp.sdk.adsbase.crashreport.C9431a;
import com.startapp.sdk.adsbase.crashreport.C9432b;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.TelephonyMetadata;
import com.startapp.sdk.common.advertisingid.AdvertisingIdResolver;
import com.startapp.sdk.jobs.C9531c;
import com.startapp.sdk.jobs.C9536f;
import com.startapp.sdk.jobs.SchedulerService;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Sta */
public class ComponentLocator {

    /* renamed from: L */
    public static final C9672z1<ComponentLocator, Context> f39020L = new C9475k();

    /* renamed from: A */
    public final C9277s5<Executor> f39021A;

    /* renamed from: B */
    public final C9277s5<Executor> f39022B;

    /* renamed from: C */
    public final C9277s5<C9256r3> f39023C;

    /* renamed from: D */
    public final C9277s5<C9441e> f39024D;

    /* renamed from: E */
    public final C9277s5<C9441e> f39025E;

    /* renamed from: F */
    public final C9277s5<C9545t> f39026F;

    /* renamed from: G */
    public final C9277s5<C9123m> f39027G;

    /* renamed from: H */
    public final C9277s5<C9432b> f39028H;

    /* renamed from: I */
    public final C9277s5<C9364h> f39029I;

    /* renamed from: J */
    public final C9277s5<C8873c3<Context, List<String>, TrackingParams, C8997h4>> f39030J;

    /* renamed from: K */
    public final C9277s5<C8897d> f39031K;

    /* renamed from: M */
    public final C9277s5<C9667ye> f39032M;

    /* renamed from: a */
    public final C9277s5<C9139md> f39033a;

    /* renamed from: b */
    public final C9277s5<C9094kd> f39034b;

    /* renamed from: c */
    public final C9277s5<C8911d6> f39035c;

    /* renamed from: d */
    public final C9277s5<C9636x4> f39036d;

    /* renamed from: e */
    public final C9277s5<C9246qa> f39037e;

    /* renamed from: f */
    public final C9277s5<C9558ta> f39038f;

    /* renamed from: g */
    public final C9277s5<AdvertisingIdResolver> f39039g;

    /* renamed from: h */
    public final C9277s5<C9661y8> f39040h;

    /* renamed from: i */
    public final C9277s5<C8923e2> f39041i;

    /* renamed from: j */
    public final C9277s5<C8910d5> f39042j;

    /* renamed from: k */
    public final C9277s5<C9641x9> f39043k = new C9277s5<>(new C9466f(this));

    /* renamed from: l */
    public final C9277s5<C9090kb> f39044l;

    /* renamed from: m */
    public final C9277s5<C8898d0> f39045m;

    /* renamed from: n */
    public final C9277s5<C9654y3> f39046n;

    /* renamed from: o */
    public final C9277s5<C9007ha> f39047o;

    /* renamed from: p */
    public final C9277s5<C9648y> f39048p;

    /* renamed from: q */
    public final C9277s5<C9185o4> f39049q;

    /* renamed from: r */
    public final C9277s5<C9059k1> f39050r;

    /* renamed from: s */
    public final C9277s5<C9245q9> f39051s;

    /* renamed from: t */
    public final C9277s5<C8871c2> f39052t;

    /* renamed from: u */
    public final C9277s5<C8886c9> f39053u;

    /* renamed from: v */
    public final C9277s5<C9130m5> f39054v;

    /* renamed from: w */
    public final C9277s5<C9045j6> f39055w;

    /* renamed from: x */
    public final C9277s5<C9256r3> f39056x;

    /* renamed from: y */
    public final C9277s5<Executor> f39057y;

    /* renamed from: z */
    public final C9277s5<Executor> f39058z;

    /* renamed from: com.startapp.sdk.components.ComponentLocator$a */
    /* compiled from: Sta */
    public class C9456a implements C8908d3<C9558ta> {

        /* renamed from: a */
        public final /* synthetic */ Context f39059a;

        /* renamed from: b */
        public final /* synthetic */ C8908d3 f39060b;

        public C9456a(Context context, C8908d3 d3Var) {
            this.f39059a = context;
            this.f39060b = d3Var;
        }

        public Object call() {
            return new C9558ta(this.f39059a, ComponentLocator.this.mo31172h(), new C9441e(this.f39059a.getSharedPreferences("StartApp-c5f5846c2a728b2a", 0), (C9441e.C9443b) null), ComponentLocator.this.mo31170f(), this.f39060b);
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$a0 */
    /* compiled from: Sta */
    public class C9457a0 implements C8908d3<C9441e> {

        /* renamed from: a */
        public final /* synthetic */ Context f39062a;

        public C9457a0(ComponentLocator componentLocator, Context context) {
            this.f39062a = context;
        }

        public Object call() {
            return new C9441e(this.f39062a.getSharedPreferences("com.startapp.sdk", 0), (C9441e.C9443b) null);
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$b */
    /* compiled from: Sta */
    public class C9458b implements C8908d3<AdvertisingIdResolver> {

        /* renamed from: a */
        public final /* synthetic */ Context f39063a;

        public C9458b(ComponentLocator componentLocator, Context context) {
            this.f39063a = context;
        }

        public Object call() {
            return new AdvertisingIdResolver(this.f39063a, new C9488q0("air"), new C9498a(this));
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$b0 */
    /* compiled from: Sta */
    public class C9459b0 implements C8908d3<C9441e> {

        /* renamed from: a */
        public final /* synthetic */ Context f39064a;

        public C9459b0(ComponentLocator componentLocator, Context context) {
            this.f39064a = context;
        }

        public Object call() {
            return new C9441e(this.f39064a.getSharedPreferences("com.startapp.sdk.extras", 0), new C9516s(this));
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$c */
    /* compiled from: Sta */
    public class C9460c implements C8908d3<C9661y8> {

        /* renamed from: a */
        public final /* synthetic */ Context f39065a;

        public C9460c(ComponentLocator componentLocator, Context context) {
            this.f39065a = context;
        }

        public Object call() {
            return new C9661y8(this.f39065a, new C9499b(this));
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$c0 */
    /* compiled from: Sta */
    public class C9461c0 implements C8908d3<C9545t> {

        /* renamed from: a */
        public final /* synthetic */ Context f39066a;

        public C9461c0(ComponentLocator componentLocator, Context context) {
            this.f39066a = context;
        }

        public Object call() {
            return new C9545t(this.f39066a);
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$d */
    /* compiled from: Sta */
    public class C9462d implements C8908d3<C8923e2> {

        /* renamed from: a */
        public final /* synthetic */ Context f39067a;

        public C9462d(Context context) {
            this.f39067a = context;
        }

        public Object call() {
            return new C8923e2(this.f39067a, ComponentLocator.this.mo31168d());
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$d0 */
    /* compiled from: Sta */
    public class C9463d0 implements C8908d3<C9123m> {

        /* renamed from: a */
        public final /* synthetic */ Context f39069a;

        public C9463d0(ComponentLocator componentLocator, Context context) {
            this.f39069a = context;
        }

        public Object call() {
            return new C9123m(this.f39069a, new C9517t(this));
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$e */
    /* compiled from: Sta */
    public class C9464e implements C8908d3<C8910d5> {

        /* renamed from: a */
        public final /* synthetic */ Context f39070a;

        public C9464e(ComponentLocator componentLocator, Context context) {
            this.f39070a = context;
        }

        public Object call() {
            return new C8910d5(new C9441e(this.f39070a.getSharedPreferences("StartApp-54ff24db2aee60b9", 0), (C9441e.C9443b) null));
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$e0 */
    /* compiled from: Sta */
    public class C9465e0 implements C8908d3<C9364h> {

        /* renamed from: a */
        public final /* synthetic */ Context f39071a;

        public C9465e0(Context context) {
            this.f39071a = context;
        }

        public Object call() {
            return new C9364h(this.f39071a, ComponentLocator.this.f39058z.mo29904a(), C9410d.f38788h);
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$f */
    /* compiled from: Sta */
    public class C9466f implements C8908d3<C9641x9> {
        public C9466f(ComponentLocator componentLocator) {
        }

        public Object call() {
            return new C9641x9();
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$f0 */
    /* compiled from: Sta */
    public class C9467f0 implements C8908d3<C8873c3<Context, List<String>, TrackingParams, C8997h4>> {
        public C9467f0(ComponentLocator componentLocator) {
        }

        public Object call() {
            return new C9519v(this);
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$g */
    /* compiled from: Sta */
    public class C9468g implements C8908d3<C9090kb> {

        /* renamed from: a */
        public final /* synthetic */ Context f39073a;

        public C9468g(Context context) {
            this.f39073a = context;
        }

        public Object call() {
            return new C9090kb(this.f39073a.getPackageName(), new C9441e(this.f39073a.getSharedPreferences("StartApp-fba1a5307d96ef31", 0), (C9441e.C9443b) null), ComponentLocator.m50249a(0, 1, "tlp", 5), ComponentLocator.this.mo31178n(), ComponentLocator.this.mo31165a(), new C9500c(this), new C9501d(this));
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$g0 */
    /* compiled from: Sta */
    public class C9469g0 implements C8908d3<C9139md> {

        /* renamed from: a */
        public final /* synthetic */ Context f39075a;

        public C9469g0(ComponentLocator componentLocator, Context context) {
            this.f39075a = context;
        }

        public Object call() {
            return new C9139md(this.f39075a, new C9515r(this));
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$h */
    /* compiled from: Sta */
    public class C9470h implements C8908d3<C8898d0> {

        /* renamed from: a */
        public final /* synthetic */ Context f39076a;

        public C9470h(ComponentLocator componentLocator, Context context) {
            this.f39076a = context;
        }

        public Object call() {
            return new C8898d0(new C9441e(this.f39076a.getSharedPreferences("StartApp-790ba54ab8e69f2f", 0), (C9441e.C9443b) null));
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$h0 */
    /* compiled from: Sta */
    public class C9471h0 implements C8908d3<C8897d> {

        /* renamed from: a */
        public final /* synthetic */ Context f39077a;

        public C9471h0(Context context) {
            this.f39077a = context;
        }

        public Object call() {
            return new C8897d(this.f39077a, ComponentLocator.this.f39039g, new C9520w(this));
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$i */
    /* compiled from: Sta */
    public class C9472i implements C8908d3<C9654y3> {

        /* renamed from: a */
        public final /* synthetic */ Context f39079a;

        /* renamed from: b */
        public final /* synthetic */ C9277s5 f39080b;

        public C9472i(Context context, C9277s5 s5Var) {
            this.f39079a = context;
            this.f39080b = s5Var;
        }

        public Object call() {
            return new C9654y3(ComponentLocator.this.mo31165a(), new C9502e(this), ComponentLocator.this.mo31179o(), new C9000h7(this.f39079a, new C9441e(this.f39079a.getSharedPreferences("StartApp-770c613f81fb5b52", 0), (C9441e.C9443b) null), new C9047j7(this.f39079a, "StartApp-ac51a09f00e0f80c"), (Executor) this.f39080b.mo29904a(), new C9503f(this)), new C9504g(this));
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$j */
    /* compiled from: Sta */
    public class C9473j implements C8908d3<C9007ha> {

        /* renamed from: a */
        public final /* synthetic */ Context f39082a;

        public C9473j(ComponentLocator componentLocator, Context context) {
            this.f39082a = context;
        }

        public Object call() {
            return new C9007ha(this.f39082a, new C9441e(this.f39082a.getSharedPreferences("StartApp-9b9bfdb86df82dad", 0), (C9441e.C9443b) null), new C9505h(this));
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$j0 */
    /* compiled from: Sta */
    public class C9474j0 implements RejectedExecutionHandler {
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            try {
                threadPoolExecutor.getQueue().put(runnable);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$k */
    /* compiled from: Sta */
    public class C9475k extends C9672z1<ComponentLocator, Context> {
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$k0 */
    /* compiled from: Sta */
    public class C9476k0 implements C8908d3<C9094kd> {

        /* renamed from: a */
        public final /* synthetic */ Context f39083a;

        public C9476k0(Context context) {
            this.f39083a = context;
        }

        public Object call() {
            return new C9094kd(this.f39083a, ComponentLocator.this.mo31187w());
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$l */
    /* compiled from: Sta */
    public class C9477l implements C8908d3<C9648y> {

        /* renamed from: a */
        public final /* synthetic */ Context f39085a;

        public C9477l(ComponentLocator componentLocator, Context context) {
            this.f39085a = context;
        }

        public Object call() {
            return new C9648y(this.f39085a);
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$l0 */
    /* compiled from: Sta */
    public class C9478l0 implements C8908d3<C9256r3> {
        public C9478l0(ComponentLocator componentLocator) {
        }

        public Object call() {
            return ComponentLocator.m50247a("db");
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$m */
    /* compiled from: Sta */
    public class C9479m implements C8908d3<C9185o4> {

        /* renamed from: a */
        public final /* synthetic */ Context f39086a;

        /* renamed from: b */
        public final /* synthetic */ C9277s5 f39087b;

        public C9479m(Context context, C9277s5 s5Var) {
            this.f39086a = context;
            this.f39087b = s5Var;
        }

        public Object call() {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 2, 5, TimeUnit.SECONDS, new PriorityBlockingQueue(), new C9488q0("info"));
            C9508k kVar = new C9508k(this, threadPoolExecutor);
            C8871c2 e = ComponentLocator.this.mo31169e();
            Context context = this.f39086a;
            ComponentLocator componentLocator = ComponentLocator.this;
            return new C9185o4(new C9111l4(this.f39086a, "StartApp-d6864f2502af7851"), (C9256r3) this.f39087b.mo29904a(), threadPoolExecutor, kVar, e, new C9579u4(context, componentLocator.f39046n, componentLocator.f39040h), new C9509l(this));
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$m0 */
    /* compiled from: Sta */
    public class C9480m0 implements C8908d3<C8911d6> {

        /* renamed from: a */
        public final /* synthetic */ Context f39089a;

        public C9480m0(ComponentLocator componentLocator, Context context) {
            this.f39089a = context;
        }

        public Object call() {
            return new C8911d6(this.f39089a);
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$n */
    /* compiled from: Sta */
    public class C9481n implements C8908d3<C9059k1> {

        /* renamed from: a */
        public final /* synthetic */ Context f39090a;

        public C9481n(Context context) {
            this.f39090a = context;
        }

        public Object call() {
            return new C9059k1(this.f39090a, ComponentLocator.this.mo31168d(), new C9441e(this.f39090a.getSharedPreferences("StartApp-dfeaf103310003d9", 0), (C9441e.C9443b) null), ComponentLocator.this.mo31170f(), ComponentLocator.this.mo31172h(), new C9510m(this));
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$n0 */
    /* compiled from: Sta */
    public class C9482n0 implements C8908d3<C9636x4> {

        /* renamed from: a */
        public final /* synthetic */ Context f39092a;

        public C9482n0(ComponentLocator componentLocator, Context context) {
            this.f39092a = context;
        }

        public Object call() {
            return new C9636x4(this.f39092a);
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$o */
    /* compiled from: Sta */
    public class C9483o implements C8908d3<C9245q9> {

        /* renamed from: a */
        public final /* synthetic */ Context f39093a;

        public C9483o(Context context) {
            this.f39093a = context;
        }

        public Object call() {
            return new C9245q9(this.f39093a, new C9441e(this.f39093a.getSharedPreferences("StartApp-6cd3cac226013e8e", 0), (C9441e.C9443b) null), ComponentLocator.this.mo31170f(), ComponentLocator.this.mo31172h(), new C9511n(this));
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$o0 */
    /* compiled from: Sta */
    public class C9484o0 implements C8908d3<TelephonyMetadata> {
        public C9484o0(ComponentLocator componentLocator) {
        }

        public Object call() {
            return MetaData.f38952k.mo30998N();
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$p */
    /* compiled from: Sta */
    public class C9485p implements C8908d3<C8871c2> {

        /* renamed from: a */
        public final /* synthetic */ Context f39095a;

        public C9485p(ComponentLocator componentLocator, Context context) {
            this.f39095a = context;
        }

        public Object call() {
            return new C8871c2(this.f39095a, new C9512o(this));
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$p0 */
    /* compiled from: Sta */
    public class C9486p0 implements C8908d3<C9246qa> {

        /* renamed from: a */
        public final /* synthetic */ Context f39096a;

        /* renamed from: b */
        public final /* synthetic */ C8908d3 f39097b;

        public C9486p0(Context context, C8908d3 d3Var) {
            this.f39096a = context;
            this.f39097b = d3Var;
        }

        public Object call() {
            return new C9246qa(this.f39096a, new C9441e(this.f39096a.getSharedPreferences("StartApp-6d5362e8ecc8a910", 0), (C9441e.C9443b) null), ComponentLocator.this.mo31172h(), ComponentLocator.this.mo31170f(), this.f39097b, new C9521x(this));
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$q */
    /* compiled from: Sta */
    public class C9487q implements C8908d3<C8886c9> {

        /* renamed from: a */
        public final /* synthetic */ Context f39099a;

        public C9487q(Context context) {
            this.f39099a = context;
        }

        public Object call() {
            return new C8886c9(this.f39099a, ComponentLocator.this.mo31175k(), new C9513p(this));
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$q0 */
    /* compiled from: Sta */
    public class C9488q0 implements ThreadFactory {

        /* renamed from: a */
        public final AtomicInteger f39101a = new AtomicInteger();

        /* renamed from: b */
        public final /* synthetic */ String f39102b;

        public C9488q0(String str) {
            this.f39102b = str;
        }

        public Thread newThread(Runnable runnable) {
            StringBuilder a = C8870c1.m48422a("startapp-");
            a.append(this.f39102b);
            a.append("-");
            a.append(this.f39101a.incrementAndGet());
            return new Thread(runnable, a.toString());
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$r */
    /* compiled from: Sta */
    public class C9489r implements C8908d3<C9130m5> {

        /* renamed from: a */
        public final /* synthetic */ Context f39103a;

        public C9489r(ComponentLocator componentLocator, Context context) {
            this.f39103a = context;
        }

        public Object call() {
            Pair pair;
            Context context = this.f39103a;
            C9536f fVar = new C9536f(context);
            if (Build.VERSION.SDK_INT >= 21) {
                pair = new Pair(new C9531c(context, SchedulerService.class), fVar);
            } else {
                pair = new Pair(fVar, fVar);
            }
            return new C9130m5((C9116l9) pair.first, (C9116l9) pair.second);
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$s */
    /* compiled from: Sta */
    public class C9490s implements C8908d3<C9045j6> {

        /* renamed from: a */
        public final /* synthetic */ Context f39104a;

        public C9490s(ComponentLocator componentLocator, Context context) {
            this.f39104a = context;
        }

        public Object call() {
            return new C9045j6(this.f39104a, new C9441e(this.f39104a.getSharedPreferences("StartApp-b36110d5cb803404", 0), (C9441e.C9443b) null), new C9514q(this), new Handler(Looper.getMainLooper()));
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$t */
    /* compiled from: Sta */
    public class C9491t implements C8908d3<C9256r3> {
        public C9491t(ComponentLocator componentLocator) {
        }

        public Object call() {
            return ComponentLocator.m50247a("core");
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$u */
    /* compiled from: Sta */
    public class C9492u implements C8908d3<Executor> {
        public C9492u(ComponentLocator componentLocator) {
        }

        public Object call() {
            return ComponentLocator.m50249a(0, 4, "net-api", 10);
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$v */
    /* compiled from: Sta */
    public class C9493v implements C8908d3<C9432b> {

        /* renamed from: a */
        public final /* synthetic */ Context f39105a;

        public C9493v(ComponentLocator componentLocator, Context context) {
            this.f39105a = context;
        }

        public Object call() {
            ANRRemoteConfig f = MetaData.f38952k.mo31024f();
            C9432b bVar = new C9432b(f != null ? f.mo30764c() : 2000, f != null && f.mo30769g());
            if (f != null && f.mo30766e()) {
                bVar.f38863b = new C9506i(this, f);
                bVar.f38862a = new C9431a(this.f39105a, "com.startapp.", f.mo30770h(), f.mo30762a(), f.mo30765d());
                if (f.mo30768f()) {
                    bVar.f38865d = new C9507j(this);
                }
                bVar.start();
            }
            return bVar;
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$w */
    /* compiled from: Sta */
    public class C9494w implements C8908d3<Executor> {
        public C9494w(ComponentLocator componentLocator) {
        }

        public Object call() {
            return ComponentLocator.m50249a(0, 2, "net-media", 10);
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$x */
    /* compiled from: Sta */
    public class C9495x implements C8908d3<Executor> {
        public C9495x(ComponentLocator componentLocator) {
        }

        public Object call() {
            return ComponentLocator.m50249a(0, 2, "disk", 5);
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$y */
    /* compiled from: Sta */
    public class C9496y implements C8908d3<Executor> {
        public C9496y(ComponentLocator componentLocator) {
        }

        public Object call() {
            return ComponentLocator.m50249a(0, 4, "generic", 5);
        }
    }

    /* renamed from: com.startapp.sdk.components.ComponentLocator$z */
    /* compiled from: Sta */
    public class C9497z implements C8908d3<C9256r3> {
        public C9497z(ComponentLocator componentLocator) {
        }

        public Object call() {
            return ComponentLocator.m50247a("dc");
        }
    }

    public ComponentLocator(Context context) {
        this.f39028H = new C9277s5<>(new C9493v(this, context));
        this.f39033a = new C9277s5<>(new C9469g0(this, context));
        this.f39034b = new C9277s5<>(new C9476k0(context));
        C9277s5 s5Var = new C9277s5(new C9478l0(this));
        this.f39035c = new C9277s5<>(new C9480m0(this, context));
        this.f39036d = new C9277s5<>(new C9482n0(this, context));
        C9484o0 o0Var = new C9484o0(this);
        this.f39037e = new C9277s5<>(new C9486p0(context, o0Var));
        this.f39038f = new C9277s5<>(new C9456a(context, o0Var));
        this.f39039g = new C9277s5<>(new C9458b(this, context));
        this.f39040h = new C9277s5<>(new C9460c(this, context));
        this.f39041i = new C9277s5<>(new C9462d(context));
        this.f39042j = new C9277s5<>(new C9464e(this, context));
        this.f39044l = new C9277s5<>(new C9468g(context));
        this.f39045m = new C9277s5<>(new C9470h(this, context));
        this.f39046n = new C9277s5<>(new C9472i(context, s5Var));
        this.f39047o = new C9277s5<>(new C9473j(this, context));
        this.f39048p = new C9277s5<>(new C9477l(this, context));
        this.f39049q = new C9277s5<>(new C9479m(context, s5Var));
        this.f39050r = new C9277s5<>(new C9481n(context));
        this.f39051s = new C9277s5<>(new C9483o(context));
        this.f39052t = new C9277s5<>(new C9485p(this, context));
        this.f39053u = new C9277s5<>(new C9487q(context));
        this.f39054v = new C9277s5<>(new C9489r(this, context));
        this.f39055w = new C9277s5<>(new C9490s(this, context));
        this.f39056x = new C9277s5<>(new C9491t(this));
        this.f39057y = new C9277s5<>(new C9492u(this));
        this.f39058z = new C9277s5<>(new C9494w(this));
        this.f39021A = new C9277s5<>(new C9495x(this));
        this.f39022B = new C9277s5<>(new C9496y(this));
        this.f39023C = new C9277s5<>(new C9497z(this));
        this.f39024D = new C9277s5<>(new C9457a0(this, context));
        this.f39025E = new C9277s5<>(new C9459b0(this, context));
        this.f39026F = new C9277s5<>(new C9461c0(this, context));
        this.f39027G = new C9277s5<>(new C9463d0(this, context));
        this.f39029I = new C9277s5<>(new C9465e0(context));
        this.f39030J = new C9277s5<>(new C9467f0(this));
        this.f39031K = new C9277s5<>(new C9471h0(context));
        this.f39032M = new C9277s5<>(new C8908d3<C9667ye>(this) {
            public Object call() {
                return new C9667ye(new C9522y(this), new C9523z(this));
            }
        });
    }

    /* renamed from: a */
    public static ComponentLocator m50248a(Context context) {
        C9672z1<ComponentLocator, Context> z1Var = f39020L;
        T t = z1Var.f39542a;
        if (t == null) {
            synchronized (z1Var) {
                t = z1Var.f39542a;
                if (t == null) {
                    Context a = C9058k0.m48718a(context);
                    if (a != null) {
                        context = a;
                    }
                    t = new ComponentLocator(context);
                    z1Var.f39542a = t;
                }
            }
        }
        return (ComponentLocator) t;
    }

    /* renamed from: b */
    public C9648y mo31166b() {
        return this.f39048p.mo29904a();
    }

    /* renamed from: c */
    public C8898d0 mo31167c() {
        return this.f39045m.mo29904a();
    }

    /* renamed from: d */
    public C9441e mo31168d() {
        return this.f39024D.mo29904a();
    }

    /* renamed from: e */
    public C8871c2 mo31169e() {
        return this.f39052t.mo29904a();
    }

    /* renamed from: f */
    public C8923e2 mo31170f() {
        return this.f39041i.mo29904a();
    }

    /* renamed from: g */
    public C9256r3 mo31171g() {
        return this.f39056x.mo29904a();
    }

    /* renamed from: h */
    public C9256r3 mo31172h() {
        return this.f39023C.mo29904a();
    }

    /* renamed from: i */
    public Executor mo31173i() {
        return this.f39021A.mo29904a();
    }

    /* renamed from: j */
    public C9441e mo31174j() {
        return this.f39025E.mo29904a();
    }

    /* renamed from: k */
    public Executor mo31175k() {
        return this.f39022B.mo29904a();
    }

    /* renamed from: l */
    public C9654y3 mo31176l() {
        return this.f39046n.mo29904a();
    }

    /* renamed from: m */
    public C9185o4 mo31177m() {
        return this.f39049q.mo29904a();
    }

    /* renamed from: n */
    public C9130m5 mo31178n() {
        return this.f39054v.mo29904a();
    }

    /* renamed from: o */
    public C8911d6 mo31179o() {
        return this.f39035c.mo29904a();
    }

    /* renamed from: p */
    public C9045j6 mo31180p() {
        return this.f39055w.mo29904a();
    }

    /* renamed from: q */
    public Executor mo31181q() {
        return this.f39057y.mo29904a();
    }

    /* renamed from: r */
    public C9661y8 mo31182r() {
        return this.f39040h.mo29904a();
    }

    /* renamed from: s */
    public C8886c9 mo31183s() {
        return this.f39053u.mo29904a();
    }

    /* renamed from: t */
    public C9641x9 mo31184t() {
        return this.f39043k.mo29904a();
    }

    /* renamed from: u */
    public C9246qa mo31185u() {
        return this.f39037e.mo29904a();
    }

    /* renamed from: v */
    public C9558ta mo31186v() {
        return this.f39038f.mo29904a();
    }

    /* renamed from: w */
    public C9139md mo31187w() {
        return this.f39033a.mo29904a();
    }

    /* renamed from: x */
    public C9667ye mo31188x() {
        return this.f39032M.mo29904a();
    }

    /* renamed from: b */
    public static ThreadFactory m50250b(String str) {
        return new C9488q0(str);
    }

    /* renamed from: a */
    public AdvertisingIdResolver mo31165a() {
        return this.f39039g.mo29904a();
    }

    /* renamed from: a */
    public static Executor m50249a(int i, int i2, String str, long j) {
        if (Build.VERSION.SDK_INT >= 21) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i2, j, TimeUnit.SECONDS, new LinkedTransferQueue<Runnable>() {
                public boolean offer(Object obj) {
                    return tryTransfer((Runnable) obj);
                }
            }, new C9488q0(str), new C9474j0());
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return threadPoolExecutor;
        } else if (i2 < 2) {
            return Executors.newSingleThreadExecutor(new C9488q0(str));
        } else {
            return Executors.newCachedThreadPool(new C9488q0(str));
        }
    }

    /* renamed from: a */
    public static C9256r3 m50247a(String str) {
        C9550t3 t3Var = new C9550t3(C9688ze.m50607a("startapp-", str));
        t3Var.start();
        return new C9275s3(new Handler(t3Var.getLooper()));
    }
}
