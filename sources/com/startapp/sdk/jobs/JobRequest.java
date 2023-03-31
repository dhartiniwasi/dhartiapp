package com.startapp.sdk.jobs;

import com.startapp.C9116l9;
import java.util.ArrayList;
import java.util.UUID;

/* compiled from: Sta */
public abstract class JobRequest {

    /* renamed from: a */
    public final String[] f39127a;

    /* renamed from: b */
    public final UUID f39128b = UUID.randomUUID();

    /* renamed from: c */
    public final Network f39129c;

    /* renamed from: d */
    public final boolean f39130d;

    /* compiled from: Sta */
    public enum Network {
        ANY,
        UNMETERED
    }

    /* renamed from: com.startapp.sdk.jobs.JobRequest$a */
    /* compiled from: Sta */
    public static abstract class C9525a<B extends C9525a<?>> {

        /* renamed from: a */
        public final String[] f39134a;

        /* renamed from: b */
        public Network f39135b;

        /* renamed from: c */
        public boolean f39136c;

        @SafeVarargs
        public C9525a(Class<? extends C9529b>... clsArr) {
            ArrayList arrayList = new ArrayList();
            for (Class<? extends C9529b> name : clsArr) {
                arrayList.add(name.getName());
            }
            this.f39134a = (String[]) arrayList.toArray(new String[0]);
        }
    }

    public JobRequest(C9525a<?> aVar) {
        this.f39127a = aVar.f39134a;
        this.f39129c = aVar.f39135b;
        this.f39130d = aVar.f39136c;
    }

    @SafeVarargs
    /* renamed from: a */
    public static int m50297a(Class<? extends C9529b>... clsArr) {
        if (clsArr.length == 0) {
            return 0;
        }
        String[] strArr = new String[clsArr.length];
        for (int i = 0; i < clsArr.length; i++) {
            strArr[i] = clsArr[i].getName();
        }
        return m50298a(strArr);
    }

    /* renamed from: a */
    public abstract boolean mo31217a(C9116l9 l9Var);

    /* renamed from: a */
    public static int m50298a(String[] strArr) {
        StringBuilder sb = new StringBuilder();
        for (String append : strArr) {
            sb.append(append);
        }
        return sb.toString().hashCode();
    }
}
