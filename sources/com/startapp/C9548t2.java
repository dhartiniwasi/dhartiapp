package com.startapp;

import java.net.InetAddress;
import java.net.UnknownHostException;

/* renamed from: com.startapp.t2 */
/* compiled from: Sta */
public class C9548t2 {

    /* renamed from: c */
    private static final String f39176c = "t2";
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Object f39177a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public InetAddress f39178b;

    /* renamed from: com.startapp.t2$a */
    /* compiled from: Sta */
    public class C9549a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f39179a;

        public C9549a(String str) {
            this.f39179a = str;
        }

        public void run() {
            try {
                InetAddress byName = InetAddress.getByName(this.f39179a);
                synchronized (C9548t2.this.f39177a) {
                    InetAddress unused = C9548t2.this.f39178b = byName;
                }
            } catch (Throwable th) {
                C9632x2.m50510a(th);
            }
        }
    }

    /* renamed from: a */
    public String mo31274a(String str, int i) throws UnknownHostException {
        String hostAddress;
        this.f39177a = new Object();
        Thread thread = new Thread(new C9549a(str));
        thread.start();
        try {
            thread.join((long) i);
        } catch (Throwable th) {
            C9632x2.m50510a(th);
        }
        synchronized (this.f39177a) {
            InetAddress inetAddress = this.f39178b;
            if (inetAddress != null) {
                hostAddress = inetAddress.getHostAddress();
            } else {
                throw new UnknownHostException();
            }
        }
        return hostAddress;
    }
}
