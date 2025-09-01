import { IRating } from '../../interfaces/Rating';

export class AdidasRating implements IRating {
  getRatingValue(): number {
    return 4.5;
  }

  getTotalReviews(): number {
    return 980;
  }
}
