import { ROLES } from '../utils/constants';
import { IPerson } from '../interfaces/IPerson';
import { Student } from '../roles/Student';
import { Teacher } from '../roles/Teacher';
import { ReceptionStaff } from '../roles/ReceptionStaff';
import { HelperStaff } from '../roles/HelperStaff';
import { Trainer } from '../roles/Trainer';

export class AttendanceFactory {
  static getPerson(role: ROLES, name: string): IPerson {
    switch (role.toLowerCase() as ROLES) {
      case ROLES.STUDENT:
        return new Student(name);
      case ROLES.TEACHER:
        return new Teacher(name);
      case ROLES.RECEPTION:
        return new ReceptionStaff(name);
      case ROLES.HELPER:
        return new HelperStaff(name);
      case ROLES.TRAINER:
        return new Trainer(name);
      default:
        throw new Error(`Unknown role: ${role}`);
    }
  }
}
