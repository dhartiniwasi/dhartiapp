package androidx.window.layout;

import android.graphics.Rect;
import androidx.window.core.Bounds;
import androidx.window.layout.FoldingFeature;
import com.unity3d.services.core.request.metrics.AdOperationMetric;
import java.util.Objects;
import kotlin.jvm.internal.C11665g;
import kotlin.jvm.internal.C11669k;

/* compiled from: HardwareFoldingFeature.kt */
public final class HardwareFoldingFeature implements FoldingFeature {
    public static final Companion Companion = new Companion((C11665g) null);
    private final Bounds featureBounds;
    private final FoldingFeature.State state;
    private final Type type;

    /* compiled from: HardwareFoldingFeature.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C11665g gVar) {
            this();
        }

        public final void validateFeatureBounds$window_release(Bounds bounds) {
            C11669k.m56787e(bounds, "bounds");
            boolean z = false;
            if ((bounds.getWidth() == 0 && bounds.getHeight() == 0) ? false : true) {
                if (bounds.getLeft() == 0 || bounds.getTop() == 0) {
                    z = true;
                }
                if (!z) {
                    throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features".toString());
                }
                return;
            }
            throw new IllegalArgumentException("Bounds must be non zero".toString());
        }
    }

    /* compiled from: HardwareFoldingFeature.kt */
    public static final class Type {
        public static final Companion Companion = new Companion((C11665g) null);
        /* access modifiers changed from: private */
        public static final Type FOLD = new Type("FOLD");
        /* access modifiers changed from: private */
        public static final Type HINGE = new Type("HINGE");
        private final String description;

        /* compiled from: HardwareFoldingFeature.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(C11665g gVar) {
                this();
            }

            public final Type getFOLD() {
                return Type.FOLD;
            }

            public final Type getHINGE() {
                return Type.HINGE;
            }
        }

        private Type(String str) {
            this.description = str;
        }

        public String toString() {
            return this.description;
        }
    }

    public HardwareFoldingFeature(Bounds bounds, Type type2, FoldingFeature.State state2) {
        C11669k.m56787e(bounds, "featureBounds");
        C11669k.m56787e(type2, "type");
        C11669k.m56787e(state2, AdOperationMetric.INIT_STATE);
        this.featureBounds = bounds;
        this.type = type2;
        this.state = state2;
        Companion.validateFeatureBounds$window_release(bounds);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C11669k.m56783a(HardwareFoldingFeature.class, obj == null ? null : obj.getClass())) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        HardwareFoldingFeature hardwareFoldingFeature = (HardwareFoldingFeature) obj;
        return C11669k.m56783a(this.featureBounds, hardwareFoldingFeature.featureBounds) && C11669k.m56783a(this.type, hardwareFoldingFeature.type) && C11669k.m56783a(getState(), hardwareFoldingFeature.getState());
    }

    public Rect getBounds() {
        return this.featureBounds.toRect();
    }

    public FoldingFeature.OcclusionType getOcclusionType() {
        if (this.featureBounds.getWidth() == 0 || this.featureBounds.getHeight() == 0) {
            return FoldingFeature.OcclusionType.NONE;
        }
        return FoldingFeature.OcclusionType.FULL;
    }

    public FoldingFeature.Orientation getOrientation() {
        if (this.featureBounds.getWidth() > this.featureBounds.getHeight()) {
            return FoldingFeature.Orientation.HORIZONTAL;
        }
        return FoldingFeature.Orientation.VERTICAL;
    }

    public FoldingFeature.State getState() {
        return this.state;
    }

    public final Type getType$window_release() {
        return this.type;
    }

    public int hashCode() {
        return (((this.featureBounds.hashCode() * 31) + this.type.hashCode()) * 31) + getState().hashCode();
    }

    public boolean isSeparating() {
        Type type2 = this.type;
        Type.Companion companion = Type.Companion;
        if (C11669k.m56783a(type2, companion.getHINGE())) {
            return true;
        }
        if (!C11669k.m56783a(this.type, companion.getFOLD()) || !C11669k.m56783a(getState(), FoldingFeature.State.HALF_OPENED)) {
            return false;
        }
        return true;
    }

    public String toString() {
        return HardwareFoldingFeature.class.getSimpleName() + " { " + this.featureBounds + ", type=" + this.type + ", state=" + getState() + " }";
    }
}
