package androidx.emoji2.text;

import androidx.emoji2.text.C1014e;
import androidx.emoji2.text.EmojiCompatInitializer;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: androidx.emoji2.text.f */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1025f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ EmojiCompatInitializer.C1002b f2749a;

    /* renamed from: b */
    public final /* synthetic */ C1014e.C1023h f2750b;

    /* renamed from: c */
    public final /* synthetic */ ThreadPoolExecutor f2751c;

    public /* synthetic */ C1025f(EmojiCompatInitializer.C1002b bVar, C1014e.C1023h hVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f2749a = bVar;
        this.f2750b = hVar;
        this.f2751c = threadPoolExecutor;
    }

    public final void run() {
        this.f2749a.m4516d(this.f2750b, this.f2751c);
    }
}
