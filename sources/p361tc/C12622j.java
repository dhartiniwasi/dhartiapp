package p361tc;

import java.util.EnumMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p182a7.C6431n;
import p336qe.C12231c;
import p336qe.C12235f;
import p381vc.C12870a;
import p381vc.C12874d;
import p381vc.C12886i;

/* renamed from: tc.j */
/* compiled from: OkHttpFrameLogger */
class C12622j {

    /* renamed from: a */
    private final Logger f46336a;

    /* renamed from: b */
    private final Level f46337b;

    /* renamed from: tc.j$a */
    /* compiled from: OkHttpFrameLogger */
    enum C12623a {
        INBOUND,
        OUTBOUND
    }

    /* renamed from: tc.j$b */
    /* compiled from: OkHttpFrameLogger */
    private enum C12624b {
        HEADER_TABLE_SIZE(1),
        ENABLE_PUSH(2),
        MAX_CONCURRENT_STREAMS(4),
        MAX_FRAME_SIZE(5),
        MAX_HEADER_LIST_SIZE(6),
        INITIAL_WINDOW_SIZE(7);
        

        /* renamed from: a */
        private final int f46348a;

        private C12624b(int i) {
            this.f46348a = i;
        }

        /* renamed from: a */
        public int mo37512a() {
            return this.f46348a;
        }
    }

    C12622j(Level level, Class<?> cls) {
        this(level, Logger.getLogger(cls.getName()));
    }

    /* renamed from: a */
    private boolean m60077a() {
        return this.f46336a.isLoggable(this.f46337b);
    }

    /* renamed from: l */
    private static String m60078l(C12231c cVar) {
        if (cVar.mo36771I() <= 64) {
            return cVar.mo36773K().mo36840q();
        }
        int min = (int) Math.min(cVar.mo36771I(), 64);
        return cVar.mo36774L(min).mo36840q() + "...";
    }

    /* renamed from: m */
    private static String m60079m(C12886i iVar) {
        EnumMap enumMap = new EnumMap(C12624b.class);
        for (C12624b bVar : C12624b.values()) {
            if (iVar.mo37912d(bVar.mo37512a())) {
                enumMap.put(bVar, Integer.valueOf(iVar.mo37909a(bVar.mo37512a())));
            }
        }
        return enumMap.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo37502b(C12623a aVar, int i, C12231c cVar, int i2, boolean z) {
        if (m60077a()) {
            Logger logger = this.f46336a;
            Level level = this.f46337b;
            logger.log(level, aVar + " DATA: streamId=" + i + " endStream=" + z + " length=" + i2 + " bytes=" + m60078l(cVar));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo37503c(C12623a aVar, int i, C12870a aVar2, C12235f fVar) {
        if (m60077a()) {
            Logger logger = this.f46336a;
            Level level = this.f46337b;
            logger.log(level, aVar + " GO_AWAY: lastStreamId=" + i + " errorCode=" + aVar2 + " length=" + fVar.mo36846w() + " bytes=" + m60078l(new C12231c().mo36777S(fVar)));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo37504d(C12623a aVar, int i, List<C12874d> list, boolean z) {
        if (m60077a()) {
            Logger logger = this.f46336a;
            Level level = this.f46337b;
            logger.log(level, aVar + " HEADERS: streamId=" + i + " headers=" + list + " endStream=" + z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo37505e(C12623a aVar, long j) {
        if (m60077a()) {
            Logger logger = this.f46336a;
            Level level = this.f46337b;
            logger.log(level, aVar + " PING: ack=false bytes=" + j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo37506f(C12623a aVar, long j) {
        if (m60077a()) {
            Logger logger = this.f46336a;
            Level level = this.f46337b;
            logger.log(level, aVar + " PING: ack=true bytes=" + j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo37507g(C12623a aVar, int i, int i2, List<C12874d> list) {
        if (m60077a()) {
            Logger logger = this.f46336a;
            Level level = this.f46337b;
            logger.log(level, aVar + " PUSH_PROMISE: streamId=" + i + " promisedStreamId=" + i2 + " headers=" + list);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo37508h(C12623a aVar, int i, C12870a aVar2) {
        if (m60077a()) {
            Logger logger = this.f46336a;
            Level level = this.f46337b;
            logger.log(level, aVar + " RST_STREAM: streamId=" + i + " errorCode=" + aVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo37509i(C12623a aVar, C12886i iVar) {
        if (m60077a()) {
            Logger logger = this.f46336a;
            Level level = this.f46337b;
            logger.log(level, aVar + " SETTINGS: ack=false settings=" + m60079m(iVar));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo37510j(C12623a aVar) {
        if (m60077a()) {
            Logger logger = this.f46336a;
            Level level = this.f46337b;
            logger.log(level, aVar + " SETTINGS: ack=true");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo37511k(C12623a aVar, int i, long j) {
        if (m60077a()) {
            Logger logger = this.f46336a;
            Level level = this.f46337b;
            logger.log(level, aVar + " WINDOW_UPDATE: streamId=" + i + " windowSizeIncrement=" + j);
        }
    }

    C12622j(Level level, Logger logger) {
        this.f46337b = (Level) C6431n.m37562o(level, "level");
        this.f46336a = (Logger) C6431n.m37562o(logger, "logger");
    }
}
