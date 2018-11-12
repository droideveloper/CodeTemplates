#parse("File Package Header.java")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import org.fs.core.AbstractEntity;
import android.os.Parcel;

public final class ${NAME} extends AbstractEntity {
    
  ${NAME}() {/*default constructor*/}
  ${NAME}(Parcel input) {
    super(input);
  }
  
  @Override protected void readParcel(Parcel input) {
    // TODO read from Parcel
  }
     
  @Override public void writeToParcel(Parcel out, int flags) {
    // TODO write to Parcel
  }
  
  @Override protected String getClassTag() {
    return ${NAME}.class.getSimpleName();
  }
  
  @Override protected boolean isLogEnabled() {
    return BuildConfig.DEBUG;
  }
  
  @Override public int describeContents() {
    return 0;
  }    
    
  public Builder newBuilder() {
    //TODO implement
    return null;
  }

  public final static Creator<${NAME}> CREATOR = new Creator<${NAME}>() {
      
    @Override public ${NAME} createFromParcel(Parcel input) {
      return new ${NAME}(input);
    }
    
    @Override public ${NAME}[] newArray(int size) {
      return new ${NAME}[size];
    }
  };
    
  public static class Builder {
    //attributes
    public Builder() { }
    public ${NAME} build() {
      //TODO implement
      return null;
    }
  }
}