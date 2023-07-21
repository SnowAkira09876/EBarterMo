package com.app.ebarter.databinding;
import com.app.ebarter.R;
import com.app.ebarter.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemReviewBindingImpl extends ItemReviewBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final com.google.android.material.card.MaterialCardView mboundView0;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.TextView mboundView5;
    @NonNull
    private final android.widget.TextView mboundView6;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemReviewBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private ItemReviewBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.imageview.ShapeableImageView) bindings[1]
            );
        this.iv.setTag(null);
        this.mboundView0 = (com.google.android.material.card.MaterialCardView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.TextView) bindings[6];
        this.mboundView6.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.model == variableId) {
            setModel((com.app.ebarter.pojos.ProductModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setModel(@Nullable com.app.ebarter.pojos.ProductModel Model) {
        this.mModel = Model;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.model);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.app.ebarter.pojos.ProductModel model = mModel;
        java.lang.String modelOwnerUserName = null;
        java.lang.String modelPhone = null;
        java.lang.String modelRequestStatus = null;
        java.lang.String modelImageLink = null;
        java.lang.String modelLocation = null;
        java.lang.String modelDescription = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (model != null) {
                    // read model.ownerUserName
                    modelOwnerUserName = model.getOwnerUserName();
                    // read model.phone
                    modelPhone = model.getPhone();
                    // read model.requestStatus
                    modelRequestStatus = model.getRequestStatus();
                    // read model.imageLink
                    modelImageLink = model.getImageLink();
                    // read model.location
                    modelLocation = model.getLocation();
                    // read model.description
                    modelDescription = model.getDescription();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.app.ebarter.utils.BindingAdapters.loadNotificationImage(this.iv, modelImageLink);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, modelOwnerUserName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, modelLocation);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, modelDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, modelPhone);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, modelRequestStatus);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): model
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}