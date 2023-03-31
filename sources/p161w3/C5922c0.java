package p161w3;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.PriorityQueue;

/* renamed from: w3.c0 */
/* compiled from: PriorityTaskManager */
public final class C5922c0 {

    /* renamed from: a */
    private final Object f29055a = new Object();

    /* renamed from: b */
    private final PriorityQueue<Integer> f29056b = new PriorityQueue<>(10, Collections.reverseOrder());

    /* renamed from: c */
    private int f29057c = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: a */
    public void mo20583a(int i) {
        synchronized (this.f29055a) {
            this.f29056b.add(Integer.valueOf(i));
            this.f29057c = Math.max(this.f29057c, i);
        }
    }

    /* renamed from: b */
    public void mo20584b(int i) {
        synchronized (this.f29055a) {
            this.f29056b.remove(Integer.valueOf(i));
            this.f29057c = this.f29056b.isEmpty() ? RecyclerView.UNDEFINED_DURATION : ((Integer) C5953m0.m35138j(this.f29056b.peek())).intValue();
            this.f29055a.notifyAll();
        }
    }
}
