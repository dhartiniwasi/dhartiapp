package p361tc;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import p182a7.C6431n;
import p264io.grpc.internal.C11335r0;
import p371uc.C12735g;
import p371uc.C12736h;
import p371uc.C12745i;
import p371uc.C12748l;

/* renamed from: tc.k */
/* compiled from: OkHttpProtocolNegotiator */
class C12625k {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final Logger f46349b;

    /* renamed from: c */
    private static final C12736h f46350c = C12736h.m60401e();

    /* renamed from: d */
    private static C12625k f46351d;

    /* renamed from: a */
    protected final C12736h f46352a;

    /* renamed from: tc.k$a */
    /* compiled from: OkHttpProtocolNegotiator */
    static final class C12626a extends C12625k {

        /* renamed from: e */
        private static final C12735g<Socket> f46353e;

        /* renamed from: f */
        private static final C12735g<Socket> f46354f;

        /* renamed from: g */
        private static final C12735g<Socket> f46355g;

        /* renamed from: h */
        private static final C12735g<Socket> f46356h;

        /* renamed from: i */
        private static final C12735g<Socket> f46357i;

        /* renamed from: j */
        private static final C12735g<Socket> f46358j;

        /* renamed from: k */
        private static final Method f46359k;

        /* renamed from: l */
        private static final Method f46360l;

        /* renamed from: m */
        private static final Method f46361m;

        /* renamed from: n */
        private static final Method f46362n;

        /* renamed from: o */
        private static final Method f46363o;

        /* renamed from: p */
        private static final Method f46364p;

        /* renamed from: q */
        private static final Constructor<?> f46365q;

        static {
            Method method;
            Method method2;
            Method method3;
            Method method4;
            Method method5;
            Method method6;
            Method method7;
            Class<String> cls = String.class;
            Class<byte[]> cls2 = byte[].class;
            Class cls3 = Boolean.TYPE;
            Constructor<?> constructor = null;
            f46353e = new C12735g<>((Class<?>) null, "setUseSessionTickets", cls3);
            f46354f = new C12735g<>((Class<?>) null, "setHostname", cls);
            f46355g = new C12735g<>(cls2, "getAlpnSelectedProtocol", new Class[0]);
            f46356h = new C12735g<>((Class<?>) null, "setAlpnProtocols", cls2);
            f46357i = new C12735g<>(cls2, "getNpnSelectedProtocol", new Class[0]);
            f46358j = new C12735g<>((Class<?>) null, "setNpnProtocols", cls2);
            Class<SSLParameters> cls4 = SSLParameters.class;
            try {
                method3 = cls4.getMethod("setApplicationProtocols", new Class[]{String[].class});
                try {
                    method4 = cls4.getMethod("getApplicationProtocols", new Class[0]);
                } catch (ClassNotFoundException e) {
                    e = e;
                    method4 = null;
                    method7 = null;
                    method = method2;
                    C12625k.f46349b.log(Level.FINER, "Failed to find Android 10.0+ APIs", e);
                    method5 = null;
                    f46361m = method3;
                    f46362n = method4;
                    f46363o = method2;
                    f46359k = method;
                    f46360l = method5;
                    method6 = SSLParameters.class.getMethod("setServerNames", new Class[]{List.class});
                    constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(new Class[]{cls});
                    f46364p = method6;
                    f46365q = constructor;
                } catch (NoSuchMethodException e2) {
                    e = e2;
                    method4 = null;
                    method2 = null;
                    method = method2;
                    C12625k.f46349b.log(Level.FINER, "Failed to find Android 10.0+ APIs", e);
                    method5 = null;
                    f46361m = method3;
                    f46362n = method4;
                    f46363o = method2;
                    f46359k = method;
                    f46360l = method5;
                    method6 = SSLParameters.class.getMethod("setServerNames", new Class[]{List.class});
                    constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(new Class[]{cls});
                    f46364p = method6;
                    f46365q = constructor;
                }
                try {
                    method2 = SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]);
                    try {
                        Class<?> cls5 = Class.forName("android.net.ssl.SSLSockets");
                        method = cls5.getMethod("isSupportedSocket", new Class[]{SSLSocket.class});
                        try {
                            method5 = cls5.getMethod("setUseSessionTickets", new Class[]{SSLSocket.class, cls3});
                        } catch (ClassNotFoundException e3) {
                            e = e3;
                            C12625k.f46349b.log(Level.FINER, "Failed to find Android 10.0+ APIs", e);
                            method5 = null;
                            f46361m = method3;
                            f46362n = method4;
                            f46363o = method2;
                            f46359k = method;
                            f46360l = method5;
                            method6 = SSLParameters.class.getMethod("setServerNames", new Class[]{List.class});
                            constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(new Class[]{cls});
                            f46364p = method6;
                            f46365q = constructor;
                        } catch (NoSuchMethodException e4) {
                            e = e4;
                            C12625k.f46349b.log(Level.FINER, "Failed to find Android 10.0+ APIs", e);
                            method5 = null;
                            f46361m = method3;
                            f46362n = method4;
                            f46363o = method2;
                            f46359k = method;
                            f46360l = method5;
                            method6 = SSLParameters.class.getMethod("setServerNames", new Class[]{List.class});
                            constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(new Class[]{cls});
                            f46364p = method6;
                            f46365q = constructor;
                        }
                    } catch (ClassNotFoundException e5) {
                        e = e5;
                        method = null;
                        C12625k.f46349b.log(Level.FINER, "Failed to find Android 10.0+ APIs", e);
                        method5 = null;
                        f46361m = method3;
                        f46362n = method4;
                        f46363o = method2;
                        f46359k = method;
                        f46360l = method5;
                        method6 = SSLParameters.class.getMethod("setServerNames", new Class[]{List.class});
                        constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(new Class[]{cls});
                        f46364p = method6;
                        f46365q = constructor;
                    } catch (NoSuchMethodException e6) {
                        e = e6;
                        method = null;
                        C12625k.f46349b.log(Level.FINER, "Failed to find Android 10.0+ APIs", e);
                        method5 = null;
                        f46361m = method3;
                        f46362n = method4;
                        f46363o = method2;
                        f46359k = method;
                        f46360l = method5;
                        method6 = SSLParameters.class.getMethod("setServerNames", new Class[]{List.class});
                        constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(new Class[]{cls});
                        f46364p = method6;
                        f46365q = constructor;
                    }
                } catch (ClassNotFoundException e7) {
                    e = e7;
                    method7 = null;
                    method = method2;
                    C12625k.f46349b.log(Level.FINER, "Failed to find Android 10.0+ APIs", e);
                    method5 = null;
                    f46361m = method3;
                    f46362n = method4;
                    f46363o = method2;
                    f46359k = method;
                    f46360l = method5;
                    method6 = SSLParameters.class.getMethod("setServerNames", new Class[]{List.class});
                    constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(new Class[]{cls});
                    f46364p = method6;
                    f46365q = constructor;
                } catch (NoSuchMethodException e8) {
                    e = e8;
                    method2 = null;
                    method = method2;
                    C12625k.f46349b.log(Level.FINER, "Failed to find Android 10.0+ APIs", e);
                    method5 = null;
                    f46361m = method3;
                    f46362n = method4;
                    f46363o = method2;
                    f46359k = method;
                    f46360l = method5;
                    method6 = SSLParameters.class.getMethod("setServerNames", new Class[]{List.class});
                    constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(new Class[]{cls});
                    f46364p = method6;
                    f46365q = constructor;
                }
            } catch (ClassNotFoundException e9) {
                e = e9;
                method4 = null;
                method3 = null;
                method7 = null;
                method = method2;
                C12625k.f46349b.log(Level.FINER, "Failed to find Android 10.0+ APIs", e);
                method5 = null;
                f46361m = method3;
                f46362n = method4;
                f46363o = method2;
                f46359k = method;
                f46360l = method5;
                method6 = SSLParameters.class.getMethod("setServerNames", new Class[]{List.class});
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(new Class[]{cls});
                f46364p = method6;
                f46365q = constructor;
            } catch (NoSuchMethodException e10) {
                e = e10;
                method4 = null;
                method3 = null;
                method2 = null;
                method = method2;
                C12625k.f46349b.log(Level.FINER, "Failed to find Android 10.0+ APIs", e);
                method5 = null;
                f46361m = method3;
                f46362n = method4;
                f46363o = method2;
                f46359k = method;
                f46360l = method5;
                method6 = SSLParameters.class.getMethod("setServerNames", new Class[]{List.class});
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(new Class[]{cls});
                f46364p = method6;
                f46365q = constructor;
            }
            f46361m = method3;
            f46362n = method4;
            f46363o = method2;
            f46359k = method;
            f46360l = method5;
            try {
                method6 = SSLParameters.class.getMethod("setServerNames", new Class[]{List.class});
                try {
                    constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(new Class[]{cls});
                } catch (ClassNotFoundException e11) {
                    e = e11;
                    C12625k.f46349b.log(Level.FINER, "Failed to find Android 7.0+ APIs", e);
                    f46364p = method6;
                    f46365q = constructor;
                } catch (NoSuchMethodException e12) {
                    e = e12;
                    C12625k.f46349b.log(Level.FINER, "Failed to find Android 7.0+ APIs", e);
                    f46364p = method6;
                    f46365q = constructor;
                }
            } catch (ClassNotFoundException e13) {
                e = e13;
                method6 = null;
                C12625k.f46349b.log(Level.FINER, "Failed to find Android 7.0+ APIs", e);
                f46364p = method6;
                f46365q = constructor;
            } catch (NoSuchMethodException e14) {
                e = e14;
                method6 = null;
                C12625k.f46349b.log(Level.FINER, "Failed to find Android 7.0+ APIs", e);
                f46364p = method6;
                f46365q = constructor;
            }
            f46364p = method6;
            f46365q = constructor;
        }

        C12626a(C12736h hVar) {
            super(hVar);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Object[]} */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x00dc, code lost:
            r9 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e2, code lost:
            throw new java.lang.RuntimeException(r9);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ea, code lost:
            r9 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f0, code lost:
            throw new java.lang.RuntimeException(r9);
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0049 A[Catch:{ InvocationTargetException -> 0x007a, IllegalAccessException -> 0x00ea, InstantiationException -> 0x00dc, IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }] */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x005d A[Catch:{ InvocationTargetException -> 0x007a, IllegalAccessException -> 0x00ea, InstantiationException -> 0x00dc, IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }] */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x00ac A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00ad  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x00dc A[ExcHandler: InstantiationException (r9v3 'e' java.lang.InstantiationException A[CUSTOM_DECLARE]), Splitter:B:2:0x000c] */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x00ea A[ExcHandler: IllegalAccessException (r9v1 'e' java.lang.IllegalAccessException A[CUSTOM_DECLARE]), Splitter:B:2:0x000c] */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo37513c(javax.net.ssl.SSLSocket r9, java.lang.String r10, java.util.List<p371uc.C12745i> r11) {
            /*
                r8 = this;
                java.lang.String[] r0 = p361tc.C12625k.m60096i(r11)
                javax.net.ssl.SSLParameters r1 = r9.getSSLParameters()
                r2 = 1
                r3 = 0
                if (r10 == 0) goto L_0x0066
                boolean r4 = p361tc.C12625k.m60095g(r10)     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                if (r4 == 0) goto L_0x0066
                java.lang.reflect.Method r4 = f46359k     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                if (r4 == 0) goto L_0x0036
                java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                r5[r3] = r9     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                r6 = 0
                java.lang.Object r4 = r4.invoke(r6, r5)     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                boolean r4 = r4.booleanValue()     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                if (r4 == 0) goto L_0x0036
                java.lang.reflect.Method r4 = f46360l     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                r5 = 2
                java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                r5[r3] = r9     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                r5[r2] = r7     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                r4.invoke(r6, r5)     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                goto L_0x0041
            L_0x0036:
                uc.g<java.net.Socket> r4 = f46353e     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                java.lang.Boolean r6 = java.lang.Boolean.TRUE     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                r5[r3] = r6     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                r4.mo37655e(r9, r5)     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
            L_0x0041:
                java.lang.reflect.Method r4 = f46364p     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                if (r4 == 0) goto L_0x005d
                java.lang.reflect.Constructor<?> r5 = f46365q     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                if (r5 == 0) goto L_0x005d
                java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                r7[r3] = r10     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                java.lang.Object r10 = r5.newInstance(r7)     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                java.util.List r10 = java.util.Collections.singletonList(r10)     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                r6[r3] = r10     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                r4.invoke(r1, r6)     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                goto L_0x0066
            L_0x005d:
                uc.g<java.net.Socket> r4 = f46354f     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                r5[r3] = r10     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                r4.mo37655e(r9, r5)     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
            L_0x0066:
                java.lang.reflect.Method r10 = f46363o     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                if (r10 == 0) goto L_0x0090
                java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ InvocationTargetException -> 0x007a, IllegalAccessException -> 0x00ea, InstantiationException -> 0x00dc }
                r10.invoke(r9, r4)     // Catch:{ InvocationTargetException -> 0x007a, IllegalAccessException -> 0x00ea, InstantiationException -> 0x00dc }
                java.lang.reflect.Method r10 = f46361m     // Catch:{ InvocationTargetException -> 0x007a, IllegalAccessException -> 0x00ea, InstantiationException -> 0x00dc }
                java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ InvocationTargetException -> 0x007a, IllegalAccessException -> 0x00ea, InstantiationException -> 0x00dc }
                r4[r3] = r0     // Catch:{ InvocationTargetException -> 0x007a, IllegalAccessException -> 0x00ea, InstantiationException -> 0x00dc }
                r10.invoke(r1, r4)     // Catch:{ InvocationTargetException -> 0x007a, IllegalAccessException -> 0x00ea, InstantiationException -> 0x00dc }
                r10 = 1
                goto L_0x0091
            L_0x007a:
                r10 = move-exception
                java.lang.Throwable r4 = r10.getTargetException()     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                boolean r4 = r4 instanceof java.lang.UnsupportedOperationException     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                if (r4 == 0) goto L_0x008f
                java.util.logging.Logger r10 = p361tc.C12625k.f46349b     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                java.util.logging.Level r4 = java.util.logging.Level.FINER     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                java.lang.String r5 = "setApplicationProtocol unsupported, will try old methods"
                r10.log(r4, r5)     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                goto L_0x0090
            L_0x008f:
                throw r10     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
            L_0x0090:
                r10 = 0
            L_0x0091:
                r9.setSSLParameters(r1)     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                if (r10 == 0) goto L_0x00ad
                java.lang.reflect.Method r10 = f46362n     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                if (r10 == 0) goto L_0x00ad
                javax.net.ssl.SSLParameters r1 = r9.getSSLParameters()     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                java.lang.Object r10 = r10.invoke(r1, r4)     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                java.lang.String[] r10 = (java.lang.String[]) r10     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                boolean r10 = java.util.Arrays.equals(r0, r10)     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                if (r10 == 0) goto L_0x00ad
                return
            L_0x00ad:
                java.lang.Object[] r10 = new java.lang.Object[r2]
                byte[] r11 = p371uc.C12736h.m60399b(r11)
                r10[r3] = r11
                uc.h r11 = r8.f46352a
                uc.h$h r11 = r11.mo37662i()
                uc.h$h r0 = p371uc.C12736h.C12744h.ALPN_AND_NPN
                if (r11 != r0) goto L_0x00c4
                uc.g<java.net.Socket> r11 = f46356h
                r11.mo37656f(r9, r10)
            L_0x00c4:
                uc.h r11 = r8.f46352a
                uc.h$h r11 = r11.mo37662i()
                uc.h$h r0 = p371uc.C12736h.C12744h.NONE
                if (r11 == r0) goto L_0x00d4
                uc.g<java.net.Socket> r11 = f46358j
                r11.mo37656f(r9, r10)
                return
            L_0x00d4:
                java.lang.RuntimeException r9 = new java.lang.RuntimeException
                java.lang.String r10 = "We can not do TLS handshake on this Android version, please install the Google Play Services Dynamic Security Provider to use TLS"
                r9.<init>(r10)
                throw r9
            L_0x00dc:
                r9 = move-exception
                java.lang.RuntimeException r10 = new java.lang.RuntimeException
                r10.<init>(r9)
                throw r10
            L_0x00e3:
                r9 = move-exception
                java.lang.RuntimeException r10 = new java.lang.RuntimeException
                r10.<init>(r9)
                throw r10
            L_0x00ea:
                r9 = move-exception
                java.lang.RuntimeException r10 = new java.lang.RuntimeException
                r10.<init>(r9)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: p361tc.C12625k.C12626a.mo37513c(javax.net.ssl.SSLSocket, java.lang.String, java.util.List):void");
        }

        /* renamed from: f */
        public String mo37514f(SSLSocket sSLSocket) {
            Method method = f46363o;
            if (method != null) {
                try {
                    return (String) method.invoke(sSLSocket, new Object[0]);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    if (e2.getTargetException() instanceof UnsupportedOperationException) {
                        C12625k.f46349b.log(Level.FINER, "Socket unsupported for getApplicationProtocol, will try old methods");
                    } else {
                        throw new RuntimeException(e2);
                    }
                }
            }
            if (this.f46352a.mo37662i() == C12736h.C12744h.ALPN_AND_NPN) {
                try {
                    byte[] bArr = (byte[]) f46355g.mo37656f(sSLSocket, new Object[0]);
                    if (bArr != null) {
                        return new String(bArr, C12748l.f46698b);
                    }
                } catch (Exception e3) {
                    C12625k.f46349b.log(Level.FINE, "Failed calling getAlpnSelectedProtocol()", e3);
                }
            }
            if (this.f46352a.mo37662i() == C12736h.C12744h.NONE) {
                return null;
            }
            try {
                byte[] bArr2 = (byte[]) f46357i.mo37656f(sSLSocket, new Object[0]);
                if (bArr2 != null) {
                    return new String(bArr2, C12748l.f46698b);
                }
                return null;
            } catch (Exception e4) {
                C12625k.f46349b.log(Level.FINE, "Failed calling getNpnSelectedProtocol()", e4);
                return null;
            }
        }

        /* renamed from: h */
        public String mo37515h(SSLSocket sSLSocket, String str, List<C12745i> list) throws IOException {
            String f = mo37514f(sSLSocket);
            return f == null ? C12625k.super.mo37515h(sSLSocket, str, list) : f;
        }
    }

    static {
        Class<C12625k> cls = C12625k.class;
        f46349b = Logger.getLogger(cls.getName());
        f46351d = m60093d(cls.getClassLoader());
    }

    C12625k(C12736h hVar) {
        this.f46352a = (C12736h) C6431n.m37562o(hVar, "platform");
    }

    /* renamed from: d */
    static C12625k m60093d(ClassLoader classLoader) {
        boolean z;
        try {
            classLoader.loadClass("com.android.org.conscrypt.OpenSSLSocketImpl");
        } catch (ClassNotFoundException e) {
            f46349b.log(Level.FINE, "Unable to find Conscrypt. Skipping", e);
            try {
                classLoader.loadClass("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
            } catch (ClassNotFoundException e2) {
                f46349b.log(Level.FINE, "Unable to find any OpenSSLSocketImpl. Skipping", e2);
                z = false;
            }
        }
        z = true;
        if (z) {
            return new C12626a(f46350c);
        }
        return new C12625k(f46350c);
    }

    /* renamed from: e */
    public static C12625k m60094e() {
        return f46351d;
    }

    /* renamed from: g */
    static boolean m60095g(String str) {
        if (str.contains("_")) {
            return false;
        }
        try {
            C11335r0.m55796c(str);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static String[] m60096i(List<C12745i> list) {
        ArrayList arrayList = new ArrayList();
        for (C12745i iVar : list) {
            arrayList.add(iVar.toString());
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo37513c(SSLSocket sSLSocket, String str, List<C12745i> list) {
        this.f46352a.mo37659c(sSLSocket, str, list);
    }

    /* renamed from: f */
    public String mo37514f(SSLSocket sSLSocket) {
        return this.f46352a.mo37661h(sSLSocket);
    }

    /* renamed from: h */
    public String mo37515h(SSLSocket sSLSocket, String str, List<C12745i> list) throws IOException {
        if (list != null) {
            mo37513c(sSLSocket, str, list);
        }
        try {
            sSLSocket.startHandshake();
            String f = mo37514f(sSLSocket);
            if (f != null) {
                return f;
            }
            throw new RuntimeException("TLS ALPN negotiation failed with protocols: " + list);
        } finally {
            this.f46352a.mo37658a(sSLSocket);
        }
    }
}
