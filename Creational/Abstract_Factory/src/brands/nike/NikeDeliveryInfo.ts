import { IDeliveryInfo } from '../../interfaces/DeliveryInfo';

export class NikeDeliveryInfo implements IDeliveryInfo {
  getDeliveryModes(): string[] {
    return ["Standard", "Express"];
  }

  getETA(): string {
    return "3–5 Business Days";
  }

  getSizesAvailable(): string[] {
    return ["7", "8", "9", "10", "11"];
  }

  getReturnPolicy(): string {
    return "10-day return policy";
  }
}
