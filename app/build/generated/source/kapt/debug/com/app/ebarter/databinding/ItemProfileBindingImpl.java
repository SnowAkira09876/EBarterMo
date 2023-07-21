package com.app.ebarter.databinding;
import com.app.ebarter.R;
import com.app.ebarter.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemProfileBindingImpl extends ItemProfileBinding  {

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
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemProfileBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private ItemProfileBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.imageview.ShapeableImageView) bindings[4]
            , (com.google.android.material.imageview.ShapeableImageView) bindings[1]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[5]
            );
        this.ivImage.setTag(null);
        this.ivProfile.setTag(null);
        this.mboundView0 = (com.google.android.material.card.MaterialCardView) bindings[0];
        this.mboundView0.setTag(null);
        this.tvCategory.setTag(null);
        this.tvLocation.setTag(null);
        this.tvName.setTag(null);
        this.tvTitle.setTag(null);
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
        java.lang.String modelLocation = null;
        java.lang.String modelImageLink = null;
        java.lang.String modelDescription = null;
        java.lang.String modelOwnerUserName = null;
        java.lang.String modelProfileLink = null;
        java.lang.String modelDetails = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (model != null) {
                    // read model.location
                    modelLocation = model.getLocation();
                    // read model.imageLink
                    modelImageLink = model.getImageLink();
                    // read model.description
                    modelDescription = model.getDescription();
                    // read model.ownerUserName
                    modelOwnerUserName = model.getOwnerUserName();
                    // read model.profileLink
                    modelProfileLink = model.getProfileLink();
                    // read model.details
                    modelDetails = model.getDetails();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.app.ebarter.utils.BindingAdapters.loadProductImage(this.ivImage, modelImageLink);
            com.app.ebarter.utils.BindingAdapters.loadProductImage(this.ivProfile, modelProfileLink);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvCategory, modelDetails);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvLocation, modelLocation);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvName, modelOwnerUserName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTitle, modelDescription);
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