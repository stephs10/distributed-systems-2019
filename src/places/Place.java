package places;

import java.io.Serializable;

public class Place implements Serializable {
  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  /*
   * Attributes
   */
  private String postalCode;
  private String locality;
  
  /*
   * Constructor
   */
  public Place(String postalCode, String locality) {
    this.postalCode = postalCode;
    this.locality = locality;
  }

  /*
   * Getters and Setters
   */
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public String getLocality() {
    return locality;
  }

  public void setLocality(String locality) {
    this.locality = locality;
  }
}
