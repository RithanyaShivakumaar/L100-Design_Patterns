export interface IDeliveryInfo {
  getDeliveryModes(): string[];
  getETA(): string;
  getSizesAvailable(): string[];
  getReturnPolicy(): string;
}
