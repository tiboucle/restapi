package com.test.restapi.model;

public enum Province {
  ACEH("Aceh"),
  SUMATERA_UTARA("Sumatera Utara"),
  SUMATERA_BARAT("Sumatera Barat"),
  RIAU("Riau"),
  JAMBI("Jambi"),
  SUMATERA_SELATAN("Sumatera Selatan"),
  LAMPUNG("Lampung"),
  BENGKULU("Bengkulu"),
  BANGKA_BELITUNG("Bangka Belitung"),
  KEPULAAN_RIAU("Kepulauan Riau"),
  JAKARTA("Jakarta"),
  JAWA_BARAT("Jawa Barat"),
  JAWA_TENGAH("Jawa Tengah"),
  YOGYAKARTA("Yogyakarta"),
  JAWA_TIMUR("Jawa Timur"),
  BANTEN("Banten"),
  BALI("Bali"),
  NUSA_TENGGARA_BARAT("Nusa Tenggara Barat"),
  NUSA_TENGGARA_TIMUR("Nusa Tenggara Timur"),
  KALIMANTAN_BARAT("Kalimantan Barat"),
  KALIMANTAN_TIMUR("Kalimantan Timur"),
  KALIMANTAN_TENGAH("Kalimantan Tengah"),
  KALIMANTAN_SELATAN("Kalimantan Selatan"),
  SULAWESI_UTARA("Sulawesi Utara"),
  SULAWESI_TENGAH("Sulawesi Tengah"),
  SULAWESI_SELATAN("Sulawesi Selatan"),
  SULAWESI_TENGGARA("Sulawesi Tenggara"),
  GORONTALO("Gorontalo"),
  SULAWESI_BARAT("Sulawesi Barat"),
  MALUKU("Maluku"),
  MALUKU_UTARA("Maluku Utara"),
  PAPUA("Papua"),
  PAPUA_BARAT("Papua Barat");

  private final String fName;

  Province(String aName) {
    fName = aName;
  }

  String getName() {
    return fName;
  }

  @Override
  public String toString() {
    return fName;
  }
}
