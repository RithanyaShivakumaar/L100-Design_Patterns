import { ROLES, PersonData } from './utils/constants';
import { AttendanceSystem } from './core/AttendanceSystem';
import { AttendanceLogger } from './core/AttendanceLogger';

const peopleToCheckIn: PersonData[] = [
  { role: ROLES.STUDENT, name: 'Alice' },
  { role: ROLES.TEACHER, name: 'Mr. John' },
  { role: ROLES.RECEPTION, name: 'Maya' },
  { role: ROLES.HELPER, name: 'Raj' },
  { role: ROLES.TRAINER, name: 'Dr. Sharma' },
];

AttendanceSystem.checkInAll(peopleToCheckIn);
AttendanceLogger.exportLogsToConsole();
