package com.startapp;

import com.startapp.C8935ee;
import java.util.ArrayDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.startapp.ke */
/* compiled from: Sta */
public class C9100ke implements C8935ee.C8936a {

    /* renamed from: a */
    public final ThreadPoolExecutor f37230a = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: b */
    public final ArrayDeque<C8935ee> f37231b = new ArrayDeque<>();

    /* renamed from: c */
    public C8935ee f37232c = null;

    /* renamed from: a */
    public void mo29632a(C8935ee eeVar) {
        eeVar.f36740a = this;
        this.f37231b.add(eeVar);
        if (this.f37232c == null) {
            C8935ee poll = this.f37231b.poll();
            this.f37232c = poll;
            if (poll != null) {
                poll.executeOnExecutor(this.f37230a, new Object[0]);
            }
        }
    }
}
